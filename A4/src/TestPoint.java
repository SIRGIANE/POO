public class TestPoint {
    public static void main(String[] args) {
        Point Q = new PointColor(7, 8, 1);
        Point P = new Point(4, 5);
        P.Afficher();
        Q.Afficher();
        System.out.println("Fin Test point");

        if (Q instanceof Point) {
            System.out.println("L'objet est une instance de la classe Point");
        } else {
            System.out.println("L'objet n'est pas une instance de la classe Point");
        }
    }
}

