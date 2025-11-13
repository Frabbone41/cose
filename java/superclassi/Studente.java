public class Studente extends Persona {

    protected String matricola;
    protected String universita;

    public Studente(String cod_fisc, String nome, String cognome, String matricola, String universita) {
        super(cod_fisc, nome, cognome);
        this.matricola = matricola;
        this.universita = universita;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getUniversita() {
        return universita;
    }
    @Override
    public String mostra(){
       return  String.format(super.mostra() + "\nmatricola: %s\nuniversità: %s", this.matricola,this.universita);
    }

}
