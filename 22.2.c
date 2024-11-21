//Input :   iRow = 3      iCol = 4

/*
    Output :
    2   4   6   8   10
    1   3   5   7   9
    2   4   6   8   10    
    
*/


#include<stdio.h>
void Pattern(int iRow, int iCol){
    int i = 0, j =0, iNo =1; 
    char ch = 'a';
    for(i = 1; i<=iRow ; i++)
    {
        for(j =1; j<=iCol; j++){
            if(i % 2 == 0)
            {
               
                printf("%d\t",(2*j) -1);
            }
            else 
            {
                printf("%d\t",j*2);
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