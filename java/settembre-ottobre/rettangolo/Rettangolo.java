

public class Rettangolo {

    private double base;
    private double altezza;
    private Punto centro = new Punto(10, 12.0);

    Rettangolo(double base, double altezza, Punto centro) {
        this.base = base;
        this.altezza = altezza;
        this.centro = centro;
    }

    Rettangolo() {
        this.base = 5;
        this.altezza = 3;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Punto[] getVertici() {
        Punto VerticeA = new Punto(this.centro.x - (this.base / 2), this.centro.y + (this.altezza / 2));
        Punto VerticeB = new Punto(this.centro.x + (this.base / 2), this.centro.y + (this.altezza / 2));
        Punto VerticeC = new Punto(this.centro.x - (this.base / 2), this.centro.y - (this.altezza / 2));
        Punto VerticeD = new Punto(this.centro.x + (this.base / 2f), this.centro.y - (this.altezza / 2));

        return new Punto[] { VerticeA, VerticeB, VerticeC, VerticeD };
    }

public boolean isRettangolo(Punto punto) {
    // Ottieni i vertici
    Punto[] vertici = getVertici();

    // Supponiamo:
    // A = top-left
    // B = top-right
    // C = bottom-left
    // D = bottom-right
  Punto A = vertici[0];
    Punto B = vertici[1];
    Punto C = vertici[2];
    Punto D = vertici[3];
  

    // Calcolo dei limiti
    double xMin = Math.min(A.getX(), C.getX());
    double xMax = Math.max(B.getX(), D.getX());
    double yMin = Math.min(C.getY(), D.getY());
    double yMax = Math.max(A.getY(), B.getY());

    // Controllo se il punto è dentro
    return punto.getX() >= xMin && punto.getX() <= xMax &&
           punto.getY() >= yMin && punto.getY() <= yMax;
}

public void isVicino(){
Punto origine = new Punto(0,0);

Punto[] vertici = getVertici();

  Punto A = vertici[0];
    Punto B = vertici[1];
    Punto C = vertici[2];
    Punto D = vertici[3];

   double   distanzaA = A.distance(origine);
   double   distanzaB = B.distance(origine);
   double   distanzaC = C.distance(origine);
   double   distanzaD = D.distance(origine);

   double minDist = distanzaA;

    if(minDist < distanzaB && minDist < distanzaC && minDist < distanzaD){
    System.out.println("il vertice A è il più vicino all'origine");
   } 
    if(minDist > distanzaB && distanzaB< distanzaC && distanzaB < distanzaD){
    System.out.println("il vertice B è il più vicino all'origine");
   } 
 if(distanzaC < distanzaB && minDist > distanzaC && minDist < distanzaD){
    System.out.println("il vertice C è il più vicino all'origine");
   } 
   if(distanzaD < distanzaB && distanzaD < distanzaC && minDist > distanzaD){
    System.out.println("il vertice D è il più vicino all'origine");
   }
   


}
}
