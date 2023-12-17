public class PointColor extends Point{
    private int couleur;
    public PointColor(){super();couleur=0;}
    public PointColor(double a,double b, int c){super(a,b);couleur=c;}
    public void Afficher(){System.out.println("X:"+x+" Y:"+y+" Couleur:"+couleur);}
    //public void Afficher(){
    // super.Afficher();
    // System.out.println("couleur:+couleur");
    // }

}