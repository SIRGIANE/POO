#include<iostream>
using namespace std;
void fonction_references(int x, int &y){ x++; y++;}
int main()
{
    int A, B;
    int a=10;
    int &b=a;

    a++;
    cout<<"a:"<< a << "b:"<< b << endl;

    A=1; B=1;
    fonction_references(A,B);
    cout<< "A: " <<A<<"B:" <<B<< endl;
    
    return 0;

}