public class GestioneVoti {
    public static void main(String[] args) {
        String[] voti = {"8", "10", "abc", "12", "-3", "7"};
        int somma = 0;
        int count = 0;

        for (String votoStr : voti) {
            try {
                int voto = Integer.parseInt(votoStr); // conversione in intero

                if (voto >= 0 && voto <= 10) {
                    somma += voto;
                    count++;
                } else {
                    System.out.println("Voto non valido (fuori range 0-10): " + voto);
                }

            } catch (NumberFormatException e) {
                System.out.println("Voto non valido: " + votoStr);
            }
        }

        if (count > 0) {
            double media = (double) somma / count;
            System.out.println("Media voti validi: " + media);
        } else {
            System.out.println("Nessun voto valido inserito.");
        }
    }
}
