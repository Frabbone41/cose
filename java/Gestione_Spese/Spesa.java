import java.time.LocalDate;

public class Spesa {
    private LocalDate data;
    private double importo;
    private String categoria;
    private String pagamento;

    public Spesa(LocalDate data, double importo, String categoria, String pagamento) {
        this.data = data;
        this.importo = importo;
        this.categoria = categoria;
        this.pagamento = pagamento;
    }

    public LocalDate getData() {
        return data;
    }

    public double getImporto() {
        return importo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPagamento() {
        return pagamento;
    }

    // Calcola prezzo con IVA 22%
    public double applicaIVA() {
        return importo * 1.22;
    }

    @Override
    public String toString() {
        return data + " - " + categoria + " - " + pagamento + " - " + importo + "€";
    }
}
