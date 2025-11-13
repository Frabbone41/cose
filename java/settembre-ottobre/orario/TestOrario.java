public class TestOrario {
    public static void main(String[] args) {
        Orario ora1 = new Orario();
        Orario ora2 = new Orario(23, 59, 59);

        System.out.println("l'orario 1 è " + ora1.mostra());
        System.out.println("l'orario 2 è " + ora2.mostra());
        ora2.tic();
        System.out.println("l'orario 2 è cambiato in " + ora2.mostra());
        boolean uguale = ora1.ugualeA(ora2);

        if(uguale == true){
            System.out.println("i due orari sono uguali");
        }else{
            System.out.println("gli orari sono");
        }
        ora1.aggiungiMinuti(125);
        System.out.println("l'orario 1 è cambiato in " + ora1.mostra());
    }
}
