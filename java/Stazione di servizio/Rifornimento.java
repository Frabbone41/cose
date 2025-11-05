public class Rifornimento {

    private double costo;
    private double litri;
    private String tipo;
    private double totale;

    public Rifornimento(double costo, double litri, String tipo, double totale) {
        this.costo = costo;
        this.litri = litri;
        this.tipo = tipo;
        this.totale = costo * litri;
    }

    public double getCosto() {
        return costo;
    }

    public double getLitri() {
        return litri;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTotale() {
        return totale;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setLitri(double litri) {
        this.litri = litri;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

}