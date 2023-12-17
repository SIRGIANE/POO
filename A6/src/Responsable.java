 public class Responsable extends Etudiant {
    private static Responsable respo=null;
    private Responsable(String nom, String filiere, int annee){
        super(nom,filiere,annee);
    }
    public static Responsable getRespo(String nom, String filiere, int annee){
        if(respo==null){
            respo=new Responsable(nom,filiere,annee);
        }
       return respo;
}}

