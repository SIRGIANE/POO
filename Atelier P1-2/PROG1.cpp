#include<iostream>
#include<string>
using namespace std;
class Localisation{
private:
    int x,y;
    string description;
public:
    Localisation(int,int);
    Localisation(int,int,string);
    void Changerxy(int,int);
    void ChangerDecription(string desc);
    void affiche(){cout <<"x: "<<x<< "\ny:"<<y<<"\nDescription = "<<description<<endl;}
};
Localisation::Localisation(int a, int b){x=a;y=b; description=""; };
Localisation::Localisation(int a, int b, string desc){x=a;y=b;description="";description= desc;};
void  Localisation ::Changerxy (int nx , int ny) {x=nx;y=ny;};
void   Localisation ::ChangerDecription (string desc ) {description = desc;};
int main(){
    Localisation P(10,20,"Boutique");P.affiche();P.Changerxy(30,40);P.affiche();
    P.ChangerDecription("Cabinet");P.affiche();
return 0;
}