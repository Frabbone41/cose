public class Main {
    public static void main(String[] args) {
        // Creiamo una pompa di benzina
        Pompa pompa1 = new Pompa("Pompa 1");

        // Creiamo alcuni rifornimenti
        Rifornimento r1 = new Rifornimento(1.90, 20, "Benzina", 0);
        Rifornimento r2 = new Rifornimento(1.75, 30, "Diesel", 0);
        Rifornimento r3 = new Rifornimento(0.99, 10, "GPL", 0);

        // Aggiungiamo i rifornimenti alla pompa
        pompa1.aggiungi(r1);
        pompa1.aggiungi(r2);
        pompa1.aggiungi(r3);

        // Stampiamo i dati
        System.out.println("=== DATI POMPA ===");
        System.out.println("Nome pompa: " + pompa1.getN_pompa());
        System.out.println("Totale litri erogati: " + pompa1.tot_litri() + " L");
        System.out.println("Totale incasso: " + pompa1.tot_soldi() + " €");

        System.out.println("\n=== DETTAGLIO RIFORNIMENTI ===");
        for (Rifornimento r : pompa1.getRif()) {
            System.out.println("Tipo: " + r.getTipo() +
                    " | Litri: " + r.getLitri() +
                    " | Costo/L: " + r.getCosto() +
                    " | Totale: " + r.getTotale() + " €");
        }
    }
}
