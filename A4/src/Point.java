public class Point {
    protected double x;
    protected double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public void Afficher() {
        System.out.println(" X:" + x + " Y:" + y);
    }
}



