public class Punto {
    public double x;
    public double y;

    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

   
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

   
    public double distance(Punto other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2.0f) + Math.pow(this.y - other.y, 2.0f));
    }

  
}