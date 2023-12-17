
public class Main {
    public static void main(String[] args) {
    Etudiant e1=new Etudiant("ouical","SMI", 2023);
    Responsable respoclass= Responsable.getRespo("hajar","SMI",2023);
    Responsable respoclas= Responsable.getRespo("ali","SMI",2023);

    System.out.println("le respo de la class : "+respoclass.getNom());

    System.out.println("le respo de la class : "+respoclas.getNom());

    System.out.println("etudiante 1 : "+ e1.getNom());
    }
}