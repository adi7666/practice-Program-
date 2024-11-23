//Input :   iRow = 6      iCol = 6

/*
    Output :
    *       *       *       *       *       *
    *                               *       *
    *                       *               *
    *               *                       *
    *       *                               *
    *       *       *       *       *       *
*/

// Incomplelete
#include<stdio.h>
void Display(int iRow, int iCol)
{
    int i = 0, j =0 ;
    
    for(i = 1; i <= iRow; i++){
        for(j = 1; j<= iCol; j++)
        {

            if(j== iCol -i +1){
                printf("*\t");
            }
            else if(i == 1 || i == iRow || j == iCol || j == 1 ){
                printf("*\t");
            }
            else if(i>= 3 && i<= 5 && j>=3 && j<= 5){
                printf("#\t");
            }
            else if(i >=2 && i <= 4 && j>= 2 && j<= 3){
                printf("@\t");
            }
        }
        printf("\n");
    }
}   

int main()
{
    int iValue1 =0, iValue2 = 0;
    printf("Enter Number of rows: \n");
    scanf("%d",&iValue1 );

    printf("Enter Number of rows: \n");
    scanf("%d",&iValue2 );

    Display(iValue1, iValue2);
    return 0;
}


         