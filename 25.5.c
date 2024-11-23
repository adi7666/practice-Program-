//Input :   iRow = 6      iCol = 6

/*
    Output :
    1       2       3       4       5
    1       2                       5
    1               3               5
    1                       4       5
    1       2       3       4       5
*/

// complelete
#include<stdio.h>
void Display(int iRow, int iCol)
{
    int i = 0, j =0 ;
    
    for(i = 1; i <= iRow; i++){
        for(j = 1; j<= iCol; j++)
        {
            if(i == 1 || i == iRow || j == iCol || j == 1 ){
                printf("%d\t", j);
            }
            else if(i==j){
                printf("%d\t", j);
            }
            else{
                printf(" \t");
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


         