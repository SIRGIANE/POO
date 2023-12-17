public class rectangle implements Geometrie{
    private double longeur;
    private double largeur;
    public rectangle(double l1, double la2){
        this.longeur=l1;
        this.largeur=la2;
    }

    public double perimetre() {
        return 2*(largeur+longeur);
    }
    public double surface() {
        return longeur*largeur;
    }
}
