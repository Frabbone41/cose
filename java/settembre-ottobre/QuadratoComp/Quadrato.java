public class Quadrato {
    private double lato;
    private double centroX;
    private double centroY;
    private double angolo; // in gradi

    public Quadrato(double lato, double centroX, double centroY, double angolo) {
        this.lato = lato;
        this.centroX = centroX;
        this.centroY = centroY;
        this.angolo = angolo;
    }

    // Classe interna per rappresentare un punto (x, y)
    public static class Punto {
        public double x, y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%.2f, %.2f)", x, y);
        }
    }

    float perimeter() {
        return (float) (4 * this.lato);
    }

    // Restituisce top, bottom, left, right

    // --- ESEMPIO D'USO ---
    public static void main(String[] args) {
        Quadrato q = new Quadrato(4.0, 0.0, 0.0, 0.0);

        System.out.println(q);
        System.out.println("Vertici:");
        for (Punto v : q.getVertici()) {
            System.out.println(v);
        }

        System.out.println("Estensioni:");
        java.util.Map<String, Punto> est = q.getEstensioni();
        System.out.println("A: " + est.get("A"));
        System.out.println("B: " + est.get("B"));
        System.out.println("C: " + est.get("C"));
        System.out.println("D: " + est.get("D"));
        System.out.println("Perimeter: " + q.perimeter());
    }

    public double getCentroX() {
        return centroX;
    }

    public double getCentroY() {
        return centroY;
    }

    // Ruota un punto attorno al centro
    private Punto ruotaPunto(double x, double y) {
        double theta = Math.toRadians(angolo);
        double dx = x - centroX;
        double dy = y - centroY;
        double xRot = centroX + dx * Math.cos(theta) - dy * Math.sin(theta);
        double yRot = centroY + dx * Math.sin(theta) + dy * Math.cos(theta);
        return new Punto(xRot, yRot);
    }

    // Restituisce i 4 vertici ruotati (in senso antiorario)
    public Punto[] getVertici() {
        double l = lato / 2.0;

        // Vertici non ruotati
        Punto[] punti = new Punto[] {
                new Punto(centroX - l, centroY - l), // A - in basso a sinistra
                new Punto(centroX + l, centroY - l), // B - in basso a destra
                new Punto(centroX + l, centroY + l), // C - in alto a destra
                new Punto(centroX - l, centroY + l) // D - in alto a sinistra
        };

        // Ruota tutti i vertici
        Punto[] ruotati = new Punto[4];
        for (int i = 0; i < 4; i++) {
            ruotati[i] = ruotaPunto(punti[i].x, punti[i].y);
        }
        return ruotati;
    }

    // Restituisce top, bottom, left, right
    public java.util.Map<String, Punto> getEstensioni() {
        Punto[] vertici = getVertici();

        Punto top = vertici[0];
        Punto bottom = vertici[0];
        Punto left = vertici[0];
        Punto right = vertici[0];

        for (Punto p : vertici) {
            if (p.y > top.y)
                top = p;
            if (p.y < bottom.y)
                bottom = p;
            if (p.x < left.x)
                left = p;
            if (p.x > right.x)
                right = p;
        }

        java.util.Map<String, Punto> result = new java.util.HashMap<>();
        result.put("top", top);
        result.put("bottom", bottom);
        result.put("left", left);
        result.put("right", right);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Quadrato(lato=%.2f, centro=(%.2f, %.2f), angolo=%.2f°)",
                lato, centroX, centroY, angolo);
    }

}
