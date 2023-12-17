
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Disque extends Cercle {
    private Color couleur;

    public Disque(Point centre, double rayon, Color couleur) {
        super(centre, rayon);
        this.couleur = couleur;
    }
    public Color getCouleur() {
        return couleur;
    }
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    public void dessinerDisque() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dessin du Disque");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new DisquePanel());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private class DisquePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            dessinerDisqueGraphique(g);
        }

        private void dessinerDisqueGraphique(Graphics g) {
            // Utilisez les coordonnées et le rayon du cercle pour dessiner le disque
            int rayonInt = (int) getRayon();
            int xCentre = getWidth() / 2;
            int yCentre = getHeight() / 2;

            // Dessiner et remplir le cercle avec la couleur spécifiée
            g.setColor(couleur);
            g.fillOval(xCentre - rayonInt, yCentre - rayonInt, 2 * rayonInt, 2 * rayonInt);

            // Dessiner la hauteur du disque
            g.setColor(Color.RED);  // Couleur de la ligne de hauteur (à ajuster selon vos préférences)
            g.drawLine(xCentre, yCentre - rayonInt, xCentre, yCentre - rayonInt );
        }
    }

}
