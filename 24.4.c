//Input :   iRow = 3      iCol = 4

/*
    Output :
    *   #   #   #   
    *   *   #   #
    *   *   *   # 
    *   *   *   * 
    
*/

// incomplete

//Input :   iRow = 3      iCol = 4

/*
    Output :
    *   *   *   *   *  
    *   *           *
    *       *       *
    *           *   *
    *   *   *   *   * 
    
*/

#include<stdio.h>
void Display(int iRow, int iCol)
{
    int i = 0, j =0 ;
    
    for(i = 1; i <= iRow; i++){
        for(j = 1; j<= iCol; j++)
        {
            if(j == 1 || j == iCol ){             //First and Last Col
                printf("*\t");
            }
             else if(i == 1 || i == iRow){
                printf("*\t");
            }
            else if(i == j) {                              //Between Col
                printf("*\t");
            }
            else{
                printf("\t");
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


         