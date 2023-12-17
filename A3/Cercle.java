
import javax.swing.*;
import java.awt.*;

public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    double getRayon(){
        return rayon;
    }

    public void afficher() {
        System.out.println("(x,y)=(" + centre.getX() + "," + centre.getY() + ")\n" + "Rayon=" + rayon);
    }

    public void dessinerCercle() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dessin du Cercle");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new CerclePanel());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    private class CerclePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            dessinerCercleGraphique(g);
        }

        private void dessinerCercleGraphique(Graphics g) {
            int rayonInt = (int) rayon;
            int xCentre = getWidth() / 2;
            int yCentre = getHeight() / 2;

            // Dessiner le cercle
            g.drawOval(xCentre - rayonInt, yCentre - rayonInt, 2 * rayonInt, 2 * rayonInt);
        }
    }
    public boolean pointAppartientCercle(Point point) {
        double distanceCarree = Math.pow(point.getX() - centre.getX(), 2) + Math.pow(point.getY() - centre.getY(), 2);
        return distanceCarree <= Math.pow(rayon, 2);
    }

}
