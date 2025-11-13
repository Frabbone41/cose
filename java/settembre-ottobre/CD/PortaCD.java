
public class PortaCD {
    private CD[] collezione;   // vettore di CD
    private int nCD;           // numero di CD effettivamente presenti

    // 🔸 Costruttore: crea il portaCD con N posti
    public PortaCD(int N) {
        collezione = new CD[N];
        nCD = 0;
    }

    // 🔸 getCD: restituisce il CD in una certa posizione
    public CD getCD(int posizione) {
        if (posizione >= 0 && posizione < collezione.length) {
            return collezione[posizione];
        } else {
            return null;  // posizione non valida
        }
    }

    // 🔸 setCD: inserisce un CD in una posizione specifica
    public void setCD(int posizione, CD cd) {
        if (posizione >= 0 && posizione < collezione.length) {
            // Se la posizione era vuota e stiamo inserendo un CD, incrementa il contatore
            if (collezione[posizione] == null && cd != null) {
                nCD++;
            }
            // Se stiamo sovrascrivendo un CD con null, decrementa
            else if (collezione[posizione] != null && cd == null) {
                nCD--;
            }

            collezione[posizione] = cd;
        } else {
            System.out.println("Posizione non valida!");
        }
    }

    // 🔸 killCD: elimina il CD in una posizione
    public void killCD(int posizione) {
        if (posizione >= 0 && posizione < collezione.length && collezione[posizione] != null) {
            collezione[posizione] = null;
            nCD--;
        }
    }

    // 🔸 getN: restituisce il numero di CD presenti
    public int getN() {
        return nCD;
    }

    // 🔸 cercaCDperTitolo: restituisce posizione del CD con quel titolo, -1 se non trovato
    public int cercaCDperTitolo(String titolo) {
        for (int i = 0; i < collezione.length; i++) {
            if (collezione[i] != null && collezione[i].getTitolo().equalsIgnoreCase(titolo)) {
                return i;
            }
        }
        return -1;
    }

    // 🔸 toString: restituisce elenco dei titoli
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collezione CD:\n");
        for (int i = 0; i < collezione.length; i++) {
            if (collezione[i] != null) {
                sb.append(i).append(") ").append(collezione[i].getTitolo()).append("\n");
            }
        }
        return sb.toString();
    }

    // 🔸 confrontaCollezione: conta i CD in comune con un'altra collezione
    public int confrontaCollezione(PortaCD altra) {
        int inComune = 0;
        for (int i = 0; i < this.collezione.length; i++) {
            CD cd1 = this.collezione[i];
            if (cd1 != null) {
                for (int j = 0; j < altra.collezione.length; j++) {
                    CD cd2 = altra.collezione[j];
                    if (cd2 != null && cd1.getTitolo().equalsIgnoreCase(cd2.getTitolo())) {
                        inComune++;
                        break;  // evita di contare doppioni
                    }
                }
            }
        }
        return inComune;
    }
}

