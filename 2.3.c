#include<stdio.h>

void Display(int iNo){
    if(iNo < 10){
        printf("Hello\n");
    }
    else {
        printf("Demo");
    }
}
int main(){
    int iValue = 0;
    printf("Enter number: ");
    scanf("%d\n", &iValue);
    Display(iValue);
    return 0;
}