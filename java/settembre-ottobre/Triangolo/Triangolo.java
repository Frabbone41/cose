public class Triangolo {
    private Punto a;
    private Punto b;
    private Punto c;

    Triangolo(Punto a, Punto b, Punto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Punto getA() {
        return a;
    }
    public Punto getB() {
        return b;
    }
    public Punto getC() {
        return c;
    }
    public void setA(Punto a) {
        this.a = a;
    }
    public void setB(Punto b) {
        this.b = b;
    }
    public void setC(Punto c) {
        this.c = c;
    }
    public double perimetro(){
        return this.a.distance(b)+this.b.distance(c)+this.c.distance(a);
 /*     double a = Math.sqrt(Math.pow(this.a.getX() - this.b.getX(), 2) +Math.pow(this.a.getY() - this.b.getY(), 2));
        double b = Math.sqrt(Math.pow(this.a.getX() - this.c.getX(), 2) +Math.pow(this.a.getY() - this.c.getY(), 2));
        double c = Math.sqrt(Math.pow(this.c.getX() - this.b.getX(), 2) +Math.pow(this.c.getY() - this.b.getY(), 2)); 

    return a+b+c;*/

    }
    public double area(){
       double semiPeri = (this.a.distance(b)+this.b.distance(c)+this.c.distance(a))/2;

       return Math.sqrt(semiPeri*(semiPeri-this.a.distance(b))*(semiPeri-this.b.distance(c))*(semiPeri-this.c.distance(a)));
    }

public String toString(){
    return "Area = " + this.area() + " Perimetro = " + this.perimetro();
}

public boolean equals(Triangolo tr){
    return this.a.equals(tr.a) && this.b.equals(tr.b) && this.c.equals(tr.c);
}

public boolean equivale(Triangolo tr){
    return this.area()==tr.area();
}
}
