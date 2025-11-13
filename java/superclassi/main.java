public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("f31g32j1fh231", "gianni", "rossi");
        Studente s1 = new Studente("kjasgdkasgdkdkajsgdfqwe12", "Frabbo", "balanutz", "ghgjhgjhgjh", "bocchini");
        Professore d1 = new Professore("j1h2g3j1gh3123gj", "ugo", "joker", "analisi 1", "non pervenuto");

        System.out.println(s1.mostra());
        System.out.println(p1.mostra());
        System.out.println(d1.mostra());

    }
}
