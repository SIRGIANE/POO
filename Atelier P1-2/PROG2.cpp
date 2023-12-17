#include <iostream>
#include <string>
using namespace std;
class Etudiant {
private:
    string Nom;
    int NbNotes;
    double *LesNotes;
    double Moy;
public:
    Etudiant(string nom, int nbNotes){
        Nom = nom;
        NbNotes = nbNotes;
        LesNotes = new double[NbNotes];
        Moy = 0.0;
    }
    string LireNom() {
        return Nom;
    }
   void SaisirNotes() {
    if (NbNotes <= 0) {
        cout << "error" << endl;
        return;
    }
    LesNotes = new double[NbNotes];
    cout << "Saisir des notes pour l'étudiant " << Nom << ":" << endl;
    for (int i =0; i< NbNotes; ++i) {
        double note;
        do{
            cout << "Note " << i + 1 << ": ";
            cin >> note;
            if (note <0 ||note >20) {
                cout << "saisir une note entre 0 et 20." << endl;
            }
        }while (note<0|| note>20);
        LesNotes[i] = note;                                                                                                                                                                                                                                                                                                                                                                                                 
    }
   }
    void CalculMoyenne() {
        double som = 0.0;
        for (int i = 0; i < NbNotes; ++i) {
            som += LesNotes[i];
        }
        Moy = som / NbNotes;
    }
    void AfficheBulletin() {
        if (NbNotes <= 0) {
            cout << "Erreur! Aucune note saisie." << endl;
            return;
        }
        cout << "Bulletin de l'etudiant " << Nom << ":" << endl;
        cout << "Nombre de notes : " << NbNotes << endl;
        cout << "Notes :\n ";
        for (int i = 0; i < NbNotes; ++i) {
            cout << LesNotes[i] << "\n ";
        }
        cout << endl;
        cout << "Moyenne : " << Moy << endl;
    }
    ~Etudiant() {
        delete[] LesNotes;
    }
};
int main() {
    Etudiant etud("ouical", 3);
    etud.SaisirNotes();
    etud.CalculMoyenne();
    etud.AfficheBulletin();
    etud.~Etudiant();
    etud.AfficheBulletin();
    return 0;
}
