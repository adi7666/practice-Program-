//Input :   iRow = 3      iCol = 4

/*
    Output :
    1   2   3   4    
        2   3   4
            3   4
                4 
    
*/

// Incomplete

#include<stdio.h>
void Display(int iRow, int iCol)
{
    int i = 0, j =0 ;
    
    for(i = 1; i <= iRow; i++){
        for(j = 1; j<= iCol; j++)
        {
            if(j == (iCol -i +1)){
                printf("#\t");
            }
            else if(i == iCol -j +1){
                printf("*\t");
            }
            else {
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


         