#include <iostream>
#include <string>
using namespace std;
class Cercle {
    private:
        double x,y,R;
        
    public:
        Cercle(double a,double b,double ray){
            x = a;
            y = b;
            R = ray;
        }
        void changerxy(double nx, double ny){
            x=nx;y=ny;
        }
        void changerRay(double nr){
            R=nr;
        }
        void affiche(){cout <<"(x,y)= "<<"("<<x<<","<<y<<")"<<"\nRayon = "<<R<<endl;
        }       
};
class Disque : public Cercle {
    private:
        string color;
    public:
        Disque():Cercle(0,0,0),color(""){}
        Disque(double a, double b, double ray, string c):Cercle(a,b,ray),color(c) {}
        void affiche(){
            Cercle::affiche();
            cout <<"couleur de remplissage:"<<color<<endl;    
        }
        void changerColor(string nvC){
            color=nvC;
        }
};
int main(){
    Cercle* ce=new Cercle(1,2,10);
    Disque disque(3,5,2,"jaune");
    cout<<"Avant de modifier :\n";
    ce->affiche();
    ce->changerxy(3,4);
    ce->changerRay(5);
    cout<<"Apres modification :\n";
    ce->affiche();
    cout<<"QST2"<<endl;
    cout<<"Avant"<<endl;
    disque.affiche();
    disque.changerxy(1,1);
    disque.changerRay(4);
    disque.changerColor("blue");
    cout<<"Apres"<<endl;
    disque.affiche();
    delete ce;
    cout<<"FIN"<<endl;
    ce->affiche();
    cout<<"CC"<<endl;
    return 0;}