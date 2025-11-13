public class Professore extends Persona {

    protected String materia;
    protected String salario;

    public Professore(String cod_fisc, String nome, String cognome, String materia, String salario) {
        super(cod_fisc, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMatricola() {
        return materia;
    }

    public String getUniversita() {
        return salario;
    }
    @Override
    public String mostra(){
       return  String.format(super.mostra() + "\nmateria: %s\nsalario: %s", this.materia,this.salario);
    }

}
