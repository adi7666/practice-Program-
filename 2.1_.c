#include<stdio.h>
void Display(int iNo){
    int iCnt =0;
    while(iCnt <= iNo){
        printf("*");
    }
}

int main(){
    int iValue = 0;
    printf("Enter Number: ");
    scanf("%d\n", &iValue);
    Display(iValue);
    return 0;
}