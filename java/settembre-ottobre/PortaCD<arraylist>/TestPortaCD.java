public class TestPortaCD {
    public static void main(String[] args) {
        PortaCD2 p1 = new PortaCD2(5);
        PortaCD2 p2 = new PortaCD2(5);

        CD cd1 = new CD("Back in Black", "AC/DC", 10, 42);
        CD cd2 = new CD("Thriller", "Michael Jackson", 9, 45);
        CD cd3 = new CD("Hybrid Theory", "Linkin Park", 12, 48);

        p1.setCD(0, cd1);
        p1.setCD(1, cd2);

        p2.setCD(0, cd2);
        p2.setCD(1, cd3);

        System.out.println(p1);
        System.out.println("CD in comune con p2: " + p1.confrontaCollezione(p2));

        int pos = p1.cercaCDperTitolo("Thriller");
        System.out.println("Posizione di Thriller: " + pos);

        p1.killCD(pos);
        System.out.println("Dopo eliminazione:\n" + p1);
    }
}
