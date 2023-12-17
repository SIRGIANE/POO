public class TestGeo {
    public static void main(String[] arg){
        Cercle cer=new Cercle(2.0);
        System.out.println("-cercle-\n");
        System.out.println("perimetre "+cer.perimetre());
        System.out.println("surface "+cer.surface());
        rectangle rec=new rectangle(2.0,3.0);
        System.out.println("-rectangle-\n");
        System.out.println("perimetre "+rec.perimetre());
        System.out.println("surface "+rec.surface());

    }
}
