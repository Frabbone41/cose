public class main1 {

    public static void main(String[] args) {
        Punto a = new Punto(3, 4);
        Punto b = new Punto(8,9);
        Punto c = new Punto(12,43);

        Punto d = new Punto(3, 4);
        Punto e = new Punto(8,9);
        Punto f = new Punto(12,43);

        Triangolo tr1 = new Triangolo(a, b, c);
        
        Triangolo tr2 = new Triangolo(d, e, f);

        System.out.println(tr1.toString());
        System.out.println(tr1.equivale(tr2));

    }
}