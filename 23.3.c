//Input :   iRow = 3      iCol = 4

/*
    Output :
    *   #   #   #   
    *   *   #   #
    *   *   *   # 
    *   *   *   * 
    
*/


#include<stdio.h>
void Pattern(int iRow, int iCol){
    int i = 0, j =0, iNo =1; 
    char ch = 'a';
    for(i = 1; i<=iRow ; i++)
    {
        for(j =1; j<=iCol; j++){
            if(i  == j)
            {
               
                printf("$\t");
            }
            
            else {
                printf("*\t");
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