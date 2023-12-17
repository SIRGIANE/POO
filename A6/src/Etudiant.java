public class Etudiant {
    protected String nom;
    protected String filiere;
    protected   int annee;
    public  Etudiant(String nom, String filiere, int annee){
        this.nom=nom; this.filiere=filiere;this.annee=annee;
    }
    public String getNom(){
        return nom;
    }
    public String getFiliere(){
        return filiere;
    }
    public int getAnnee(){
        return annee;
    }
}
