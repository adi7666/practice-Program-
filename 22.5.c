//Input :   iRow = 4      iCol = 4

/*
    Output :
    1   2   3   4
    2   3   4   5
    3   4   5   6
    4   5   6   7  
    
*/


#include<stdio.h>
void Pattern(int iRow, int iCol){
    int i = 0, j =0, num = 1;
    for(i = 1; i<=iRow ; i++)
    {
        for(j = 0; j<iCol; j++){
            // printf("%d\t",);
            printf("%d\t", j+i);
            
        
        }
        printf("\n");
    }
}
int main()
{
    int iValue1 = 0, iValue2 = 0;
    printf("Enter number in row and columns :\n");
    scanf("%d%d", &iValue1,&iValue2);

    Pattern(iValue1, iValue2);
    return 0;
}