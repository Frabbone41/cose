public class Persona {
    protected String cod_fisc;
    protected String nome;
    protected String cognome;

    public Persona(String cod_fisc, String nome, String cognome) {
        this.cod_fisc = cod_fisc;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCod_fisc() {
        return cod_fisc;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setCod_fisc(String cod_fisc) {
        this.cod_fisc = cod_fisc;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostra() {
        return String.format("nome: %s\ncogmome: %s\ncodice fiscale: %s", this.nome, this.cognome, this.cod_fisc);
    }

}