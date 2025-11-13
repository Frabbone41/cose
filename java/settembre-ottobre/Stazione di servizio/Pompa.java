import java.util.ArrayList;

public class Pompa {

    private ArrayList<Rifornimento> rif;
    private String n_pompa;

    public Pompa(String n_pompa) {
        this.rif = new ArrayList<Rifornimento>();
        this.n_pompa = n_pompa;
    }
    public ArrayList<Rifornimento> getRif() {
        return rif;
    }

    public void setN_pompa(String n_pompa) {
        this.n_pompa = n_pompa;
    }

    public String getN_pompa() {
        return n_pompa;
    }

    public void aggiungi(Rifornimento r) {
        this.rif.add(r);
    }

    public double tot_soldi() {
        double totale = 0;
        for(Rifornimento r : rif){
            totale += r.getTotale();
        }
        return totale;
    }

    public double tot_litri() {
        double totale = 0;
        for (Rifornimento r: rif) {
            totale += r.getLitri();
        }

        return totale;
    }

}
