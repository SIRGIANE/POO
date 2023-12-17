public class Vecteur {
    private Point x;
    private Point y;

    public Vecteur(Point x, Point y) {
        this.x = x;
        this.y = y;
    }
    void afficher(){
       System.out.println("(x1,y1)= ("+x.getX()+","+x.getY()+")"+"\n(x2,y2)=("+y.getX()+","+y.getY()+")");
    }
}