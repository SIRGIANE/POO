public class TestPositif {
    public static void main(String[] args) {
        positive p2 = null;
        try {
            positive p1 = new positive(22);
            p2 = new positive(12);
            System.out.println("p1=" + p1.getValeur());
        } catch (Err e) {
            System.out.println("***ERREUR dans le constructeur***");
            // Gérer l'exception ici si nécessaire
            // System.exit(-1);
        } finally {
            if (p2 != null) {
                System.out.println("p2=" + p2.getValeur());
            }
        }
    }
}
