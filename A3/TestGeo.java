import java.awt.*;
import java.util.Scanner;

public class TestGeo{
            public static void main(String[] args) {
                Point point = new Point(1, 2);
                Point point2=new Point(2,3);
                Vecteur vecteur = new Vecteur(point, point2);
                Cercle cercle = new Cercle(point, 50);
                Droite droite = new Droite(point, vecteur);
                Ligne ligne = new Ligne();
                //Affiche de points
                point.afficher();
                point2.afficher();
                //Affichege de vecteur
                vecteur.afficher();
                //Affichege de cercle
                cercle.afficher();
                //cercle.dessinerCercle();
                System.out.println("le point est dans le cercle ?\n"+cercle.pointAppartientCercle(point));
                // Exemple d'utilisation avec une couleur spécifiée par l'utilisateur
                Scanner scanner = new Scanner(System.in);
                System.out.println("Entrez la couleur du disque (par exemple, 'red', 'green', 'blue') : ");
                String couleurInput = scanner.nextLine();
                // Conversion de la chaîne de couleur en objet Color
                Color couleur = getColorFromString(couleurInput);
                if (couleur == null) {
                    System.out.println("Couleur non valide. Utilisation de la couleur par défaut (noir).");
                    couleur = Color.BLACK;
                }
                // Création d'une instance de Disque avec la couleur spécifiée par l'utilisateur
                Disque disque = new Disque(new Point(0, 0), 50, couleur);
                disque.dessinerDisque();
            }
    // Méthode utilitaire pour obtenir la couleur à partir du nom de la chaîne
    private static Color getColorFromString(String colorName) {
        try {
            return (Color) Color.class.getField(colorName.toUpperCase()).get(null);
        } catch (Exception e) {
            return null;
        }
        }}
