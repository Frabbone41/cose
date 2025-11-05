public class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate distance to another point
    public double distance(Punto other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
    public boolean equals(Punto other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "Punto(" + "x=" + x + ", y=" + y + ')';
    }
}