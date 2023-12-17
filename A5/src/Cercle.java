public class Cercle implements Geometrie {
    private double rayon;
    public Cercle(double r ){
        this.rayon=r;
    }
    public double perimetre() {
        return 2*Math.PI*rayon;
    }
    public double surface() {
        return Math.PI*rayon*rayon;
    }
}
