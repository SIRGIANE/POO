#include<iostream>
int main(){
    const int DIM=5;
    double *tab;
    tab = new double[DIM];
    for(int i=0; i < DIM; i++)tab[i] = i*2;
    for(int i=0; i < DIM; i++)std:: cout<<"tab["<<i<<"]:" <<tab[i] <<std:: endl;
    delete[]tab;
    return 0;
}