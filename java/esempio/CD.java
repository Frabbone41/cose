/*Implementare in linguaggio Java una classe CD i cui oggetti rappresentano CD audio.
Ogni oggetto CD deve avere almeno le seguenti caratteristiche: titolo, autore, numero brani, durata.
La classe deve avere i seguenti metodi:
- costruttore che ha come parametri titolo, autore, numero brani e durata;
- toString che restituisce una stringa con tutti i dati dell’oggetto su cui è invocato;
- compareDurata che consente di confrontare la durata complessiva del CD con la durata passata come parametro
Inserire nella classe un metodo main che consenta di verificarne tutte le funzionalità.
 */

public class CD {
        private String titolo;
        private String autore;
        private int numeroBrani;
        private double durata; // durata in minuti

        public CD(String titolo, String autore, int numeroBrani, double durata) {
            this.titolo = titolo;
            this.autore = autore;
            this.numeroBrani = numeroBrani;
            this.durata = durata;
        }
        public String toString() {
            return "Titolo: " + titolo + ", Autore: " + autore + ", Numero Brani: " + numeroBrani + ", Durata: " + durata + " minuti";
        }
        public double getDurata() {
            return durata;
        }
        public int compareDurata(double durata, double durata2) {
          if (this.durata < durata && this.durata < durata2) {
              return -1; // meno di entrambi
          } else if (this.durata > durata && this.durata > durata2) {
              return 1; // più di entrambi
          } else {
              return 0; // tra i due o uguale a uno dei due
          }
        }
        
    }

