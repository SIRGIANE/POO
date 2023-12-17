public class Fille extends Mere{
    private int c=10;
    public Fille(int aa, int bb, int cc){
        super(aa,bb);
        System.out.println("Debut Fille:"+"a= "+a+"b= "+b+"c= "+c);
        c=cc;
        System.out.println("Fin Fille: "+"a= "+a+"b= "+b+"c= "+c);
    }
}
