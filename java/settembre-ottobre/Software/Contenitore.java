public class Contenitore{

    private Programma[] programmi;
    private int nMax;
    private int nAttuali;

    public Contenitore(int N) {
        this.nMax = N;
        this.programmi = new Programma[N];
        this.nAttuali = 0;
    }

    public Programma getProgramma(int pos) {
        if (pos >= 0 && pos < nMax) {
            return programmi[pos];
        }
        return null;
    }

    public void setProgramma(int pos, Programma p) {
        if (pos >= 0 && pos < nMax) {
            if (programmi[pos] == null) {
                nAttuali++;
            }
            programmi[pos] = p;
        }
    }

    public void killProgramma(int pos) {
        if (pos >= 0 && pos < nMax && programmi[pos] != null) {
            programmi[pos] = null;
            nAttuali--;
        }
    }

    public int getN() {
        return nAttuali;
    }

    public int cercaProgrammaPerDenominazione(String denominazione) {
        for (int i = 0; i < nMax; i++) {
            if (programmi[i] != null && programmi[i].getDenominazione().equalsIgnoreCase(denominazione)) {
                return i;
            }
        }
        return -1;
    }

  /*  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Programmi nel contenitore:\n");
        for (int i = 0; i < nMax; i++) {
            if (programmi[i] != null) {
                sb.append(i).append(": ").append(programmi[i].getDenominazione()).append("\n");
            }
        }
        return sb.toString();
    }  */

    public int confrontaContenitore(Contenitore altro) {
        int count = 0;
        for (int i = 0; i < this.nMax; i++) {
            Programma p = this.programmi[i];
            if (p != null && altro.cercaProgrammaPerDenominazione(p.getDenominazione()) != -1) {
                count++;
            }
        }
        return count;
    }
}
