public class Libro {
    private String titolo;
    private String autore;
    private int numeropagine;
    private double costoPagina = 0.05;
    private final double COSTO_FISSO = 5.5;

    Libro(String titolo, String autore, int numeropagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeropagine = numeropagine;

    }

    Libro(){
        this.titolo = "Sconosciuto";
        this.autore = "Sconosciuto";
        this.numeropagine = 0;
    }

    public int getNumeropagine() {
        return this.numeropagine;
    }

    public double getCostoPagina() {
        return this.costoPagina;
    }

    public String getTitolo() {
        return this.titolo;
    }
        
    public String getAutore() {
        return this.autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setNumeropagine(int numeropagine) {
        this.numeropagine = numeropagine;
    }

    public void setCostoPagina(double costoPagina) {
        this.costoPagina = costoPagina;
    }

    public double costo(){
        return (this.numeropagine * this.costoPagina) + this.COSTO_FISSO;
    }
    public static void main(String[] args) {
        Libro libro1 = new Libro("il signore degli anelli", "J.R.R Tolkien", 1100);
        Libro libro2 = new Libro();
        libro2.setAutore("stephen king");
        libro2.setTitolo("IT");
        libro2.setNumeropagine(1500);
        System.out.println("il prezzo di " + libro1.getTitolo() + " è " + libro1.costo());
        System.out.println("il prezzo di " + libro2.getTitolo() + " è " + libro2.costo());
}
}
