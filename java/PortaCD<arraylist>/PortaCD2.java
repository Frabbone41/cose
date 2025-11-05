import java.util.ArrayList;

public class PortaCD2 {
    private ArrayList<CD> collezione; // lista dinamica di CD
    private int capacitaMax;          // numero massimo di CD consentiti

    //  Costruttore: crea un portaCD con capacità massima N
    public PortaCD2(int n) {
        this.capacitaMax = n;
        this.collezione = new ArrayList<CD>();
    }

    //  getCD: restituisce il CD in una posizione specifica
    public CD getCD(int posizione) {
        if (posizione >= 0 && posizione < this.collezione.size()) {
            return this.collezione.get(posizione);
        } else {
            return null; // posizione non valida
        }
    } 
 
    //  setCD: inserisce un CD in una posizione specifica (sostituisce se già presente)
    public void setCD(int posizione, CD cd) {
        if (collezione.size() >= capacitaMax && posizione >= collezione.size()) {
            System.out.println("PortaCD pieno! Impossibile aggiungere altri CD.");
            return;
        }

        if (posizione < 0 || posizione > collezione.size()) {
            System.out.println("Posizione non valida!");
            return;
        }

        if (posizione < collezione.size()) {
            collezione.set(posizione, cd); // sostituisce un CD esistente
        } else {
            collezione.add(cd); // aggiunge alla fine se la posizione è l’ultima disponibile
        }
    }

    //  killCD: elimina il CD in una posizione specifica
    public void killCD(int posizione) {
        if (posizione >= 0 && posizione < collezione.size()) {
            collezione.remove(posizione);
        } else {
            System.out.println("Posizione non valida!");
        }
    }

    //  getN: restituisce il numero di CD presenti
    public int getN() {
        return collezione.size();
    }

    //  cercaCDperTitolo: restituisce la posizione del CD con quel titolo, -1 se non trovato
    public int cercaCDperTitolo(String titolo) {
        for (int i = 0; i < collezione.size(); i++) {
            if (collezione.get(i).getTitolo().equalsIgnoreCase(titolo)) {
                return i;
            }
        }
        return -1;
    }

    // toString: restituisce un elenco leggibile dei CD presenti
    @Override
    public String toString() {
        if (collezione.isEmpty()) return "Il PortaCD è vuoto.";

        StringBuilder sb = new StringBuilder("Collezione CD:\n");
        for (int i = 0; i < collezione.size(); i++) {
            sb.append(i).append(") ").append(collezione.get(i).getTitolo()).append("\n");
        }
        return sb.toString();
    }

    // confrontaCollezione: restituisce il numero di CD in comune con un’altra collezione
    public int confrontaCollezione(PortaCD2 altra) {
        int inComune = 0;
        for (CD cd1 : this.collezione) {
            for (CD cd2 : altra.collezione) {
                if (cd1.getTitolo().equalsIgnoreCase(cd2.getTitolo())) {
                    inComune++;
                    break; // evita di contare doppioni
                }
            }
        }
        return inComune;
    }
}
