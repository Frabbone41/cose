import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class QuadratoGUI extends JPanel {
    private Quadrato q;

    public QuadratoGUI() {
        // Creo un quadrato con lato 100, centro nella finestra e angolo 0°
        q = new Quadrato(100, 200, 200, 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Prendo i vertici del quadrato
        Quadrato.Punto[] vertici = q.getVertici();

        // Creo un poligono per disegnare il quadrato
        Path2D.Double path = new Path2D.Double();
        path.moveTo(vertici[0].x, vertici[0].y);
        for (int i = 1; i < vertici.length; i++) {
            path.lineTo(vertici[i].x, vertici[i].y);
        }
        path.closePath();

        // Disegno il contorno
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(2));
        g2.draw(path);

        // Disegno il centro
        g2.setColor(Color.RED);
        g2.fillOval((int) q.getCentroX() - 3, (int) q.getCentroY() - 3, 6, 6);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quadrato Ruotato");
        QuadratoGUI panel = new QuadratoGUI();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
