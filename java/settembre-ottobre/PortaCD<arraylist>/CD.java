public class CD {
    private String autore;
    private String titolo;
    private int n_brani;
    private int durata; // in minuti

    public CD(String autore, String titolo, int n_brani, int durata) {
        this.autore = autore;
        this.titolo = titolo;
        this.n_brani = n_brani;
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public int getDurata() {
        return durata;
    }

    public int getN_brani() {
        return n_brani;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setN_brani(int n_brani) {
        this.n_brani = n_brani;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
     public String toString() {
            return "Titolo: " + titolo + ", Autore: " + autore + ", Numero Brani: " + n_brani + ", Durata: " + durata + " minuti";
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
