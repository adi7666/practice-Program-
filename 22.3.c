//Input :   iRow = 50    iCol = 5

/*
    Output :
    a   b   c   d   e
    1   2   3   4   5      
    a   b   c   d   e
    1   2   3   4   5      
    
*/


#include<stdio.h>
void Pattern(int iRow, int iCol){
    int i = 0, j =0; 
    char ch = 'a';
    for(i = 1; i<=iRow ; i++)
    {
        for(j =0; j<=iCol; j++){
            if(i % 2 == 0)
            {
                printf("%d\t",j+1);
            }
            else 
            {
                printf("%c\t",ch+j);
            }
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