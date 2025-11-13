public class TestManager2 {
    public static void main(String[] args) {

        // Creo due gestori di software con capacità 5
        Manager2 m1 = new Manager2(5);
        Manager2 m2 = new Manager2(5);

        // Creo alcuni oggetti Software (usando tutti gli attributi)
        Software s1 = new Software("Photoshop", "Adobe", "2025", "Windows", 2025);
        Software s2 = new Software("Word", "Microsoft", "2021", "Windows", 2021);
        Software s3 = new Software("Excel", "Microsoft", "2022", "Windows", 2022);
        Software s4 = new Software("Visual Studio Code", "Microsoft", "1.90", "Windows/Linux/Mac", 2025);
        Software s5 = new Software("Gimp", "GNU", "2.10", "Linux", 2024);

        // Aggiungo software al primo contenitore
        m1.addSoftware(0, s1); // Photoshop
        m1.addSoftware(1, s2); // Word
        m1.addSoftware(2, s3); // Excel

        // Aggiungo software al secondo contenitore
        m2.addSoftware(0, s2); // Word
        m2.addSoftware(1, s4); // Visual Studio Code
        m2.addSoftware(2, s5); // Gimp 

        // Stampo i contenitori
        System.out.println("=== Contenitore 1 ===");
        System.out.println(m1);

        System.out.println("=== Contenitore 2 ===");
        System.out.println(m2);

        // Test ricerca
        System.out.println("\nRicerca:");
        System.out.println(" - 'Word' in m1 → indice: " + m1.cercaSoftwarePerDenominazione("Word"));
        System.out.println(" - 'Gimp' in m1 → indice: " + m1.cercaSoftwarePerDenominazione("Gimp"));

        // Test confronto
        System.out.println("\nConfronto tra contenitori:");
        System.out.println("Numero di software in comune tra m1 e m2: " + m1.confrontaContenitore(m2));

        // Test rimozione
        System.out.println("\nRimuovo l'elemento in posizione 1 da m1...");
        m1.rimuoviSoftware(1);

        System.out.println("=== Contenitore 1 dopo rimozione ===");
        System.out.println(m1);

        // Test aggiunta oltre capacità
        System.out.println("\nProvo ad aggiungere oltre la capacità massima...");
        m1.addSoftware(3, s4);
        m1.addSoftware(4, s5);
        m1.addSoftware(5, new Software("Autocad", "Autodesk", "2025", "Windows", 2025)); // dovrebbe dare errore

        System.out.println("=== Contenitore 1 finale ===");
        System.out.println(m1);
    }
}
