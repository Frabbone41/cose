import java.util.ArrayList;

public class Manager2 {

    private ArrayList<Software> cont;
    private int n_max;

    public Manager2(int n) {
        this.n_max = n;
        this.cont = new ArrayList<Software>();
    }

    public Software getSoftware(int p) {
        if (p >= 0 && p < this.cont.size()) {
            return this.cont.get(p);
        } else {
            return null;
        }
    }

    public void addSoftware(int p, Software s1) {
        if (p < 0) {
            System.out.println("Posizione non valida!");
            return;
        }

        if (p < cont.size()) {
            cont.set(p, s1);
        } else if (cont.size() < n_max) {
            cont.add(s1);
        } else {
            System.out.println("Contenitore software pieno! Impossibile aggiungere altri Software.");
        }
    }

    /*
     * public void setSoftware(int p, Software s1) {
     * if (contenitore.size() >= this.n_max && p >= contenitore.size()) {
     * System.out.
     * println("Contenitore software pieno! Impossibile aggiungere altri Software."
     * );
     * return;
     * }
     * 
     * if (p < 0 || p > contenitore.size()) {
     * System.out.println("Posizione non valida!");
     * return;
     * }
     * 
     * if (p < contenitore.size()) {
     * contenitore.set(p , s1);
     * } else {
     * contenitore.add(s1);
     * }
     * }
     */

    public void rimuoviSoftware(int p) {
        if (p >= 0 && p < cont.size()) {
            cont.remove(p);
        } else {
            System.out.println("Posizione non valida!");
        }
    }

    public int cercaSoftwarePerDenominazione(String denominazione) {
        for (int i = 0; i < cont.size(); i++) {
            if (cont.get(i).getDenominazione().equalsIgnoreCase(denominazione)) {
                return i;
            }
        }
        return -1;
    }

    public int confrontaContenitore(Manager2 altro) {
        int count = 0;
        for (Software p : this.cont) {
            if (altro.cercaSoftwarePerDenominazione(p.getDenominazione()) != -1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "Software nel contenitore:\n";
        for (int i = 0; i < cont.size(); i++) {
            Software p = cont.get(i);
            result += (i + 1) + ") " + p.getDenominazione() + "\n";
        }
        return result;
    }

}