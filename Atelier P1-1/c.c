#include<stdio.h>
void permute(int x, int *y){
    x++;
    (y++);
}
int main(){
    int x=1,*y=1;
    permute(x,&y);
    printf("x%d", x);
    printf("y=%d",*y);
}
