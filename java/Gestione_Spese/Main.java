import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Creo l'oggetto che gestisce le spese
        GestioneSpese lista = new GestioneSpese();

        // Aggiungo alcune spese di esempio
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 10), 50.0, "Cibo", "Contanti"));
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 12), 120.0, "Tecnologia", "Carta"));
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 15), 30.0, "Cibo", "Carta"));
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 18), 200.0, "Viaggi", "Carta"));
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 20), 15.0, "Cibo", "Contanti"));
        lista.aggiungi(new Spesa(LocalDate.of(2025, 1, 22), 80.0, "Tecnologia", "Contanti"));

        // Stampo la lista di tutte le spese
      /*  System.out.println("ELENCO SPESE:");
        for (Spesa s : lista.getLista()) {
            System.out.println(s);
        } */
        lista.mostraSpese();

        System.out.println("\nTotale spese: " + lista.totale() + "€");
        System.out.println("Media spese: " + lista.mediaspesa() + "€");

        System.out.println(lista.maxmin());
        System.out.println(lista.catg());
        System.out.println( lista.pagaments());
    }
}
