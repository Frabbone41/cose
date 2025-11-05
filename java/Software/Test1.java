public class Test1 {
    public static void main(String[] args) {
       
        Programma p1 = new Programma("Word", "Microsoft", "2021", "Windows", 2021);
        Programma p2 = new Programma("Photoshop", "Adobe", "2022", "Windows", 2022);
        Programma p3 = new Programma("Word", "Microsoft", "2021", "Mac", 2021);

        Contenitore c1 = new Contenitore(5);
        Contenitore c2 = new Contenitore(5);

        c1.setProgramma(0, p1);
        c1.setProgramma(1, p2);

        c2.setProgramma(0, p3);

        System.out.println(c1);
        System.out.println(c2);

        int pos = c1.cercaProgrammaPerDenominazione("Word");
        System.out.println("Word si trova in posizione: " + pos);

        int comuni = c1.confrontaContenitore(c2);
        System.out.println("Programmi in comune: " + comuni);
    }
}
