/*
    Assignment 3: question no 1.
    Write a program which accept one number from user and print that number of
     even number on Scren.
*/
//////////////////////////////////////////////////////////////////
// Function Name : printEven  
// Description : It is used to perfrom to print the * in given no of times 
// Input : int
// Output :int
// Author : Aditya Jagtap
//  Date  : 22-09-2024

//////////////////////////////////////////////////////////////////
#include<stdio.h>
int printEven(int iNo){
    if(iNo <= 0){
        return 0;
    }
    //LOGIC
    int iCnt = 0;
    for(iCnt =1; iCnt<=iNo; iCnt++){
        printf("%d\t", 2*iCnt);
        
    }
    // pr;intf("\n")
}
// Entry Fuction
int main(){
    int iValue =0;
    printf("Enter Number\n");
    scanf("%d\n", &iValue);
    printEven(iValue);

    return 0;
}