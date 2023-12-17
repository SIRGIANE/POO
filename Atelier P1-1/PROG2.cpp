#include<iostream>
using namespace std;
//la fct pour permuter
void permute(int &a, int &b){
    int temp=a;
    a=b;
    b=temp;
}

int main(){
    int x=1, y=2;
    cout<<"Avant : x="<<x<<" et y="<<y<<endl;
    permute(x,y); //appel de la fonction avec les variables en paramètres.
    cout << "Apres:  x = "<<x <<"et y ="<<y<< endl ;

    return 0;
}