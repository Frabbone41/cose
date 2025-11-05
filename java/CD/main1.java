public class main1 {
    public class TestPortaCD {
    public static void main(String[] args) {
        PortaCD p1 = new PortaCD(5);
        PortaCD p2 = new PortaCD(5);

        CD cd1 = new CD("Back in Black", "AC/DC", 10, 42);
        CD cd2 = new CD("Thriller", "Michael Jackson", 9, 45);
        CD cd3 = new CD("Hybrid Theory", "Linkin Park", 12, 48);

        p1.setCD(0, cd1);
        p1.setCD(1, cd2);

        p2.setCD(0, cd2);
        p2.setCD(1, cd3);

        System.out.println(p1.toString());
        System.out.println("CD in comune: " + p1.confrontaCollezione(p2));

        System.out.println("Posizione di Thriller in p1: " + p1.cercaCDperTitolo("Thriller"));
        p1.killCD(1);
        System.out.println("Dopo eliminazione:\n" + p1.toString());
    }
}

}
