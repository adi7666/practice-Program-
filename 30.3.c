#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool ChkAlpha(char ch)
{
    bool bflag = false;
    if(ch >= '0' && ch <= '9')
     {
        bflag = true;        
    }
    
    else{
        bflag = false;
    }
    return bflag;
}

int main (){
    char cVALUE = '\0';
    bool bRet = false;
    printf("Enter the Character : \n");
    scanf("%c", &cVALUE);
    bRet = ChkAlpha(cVALUE);

    if(bRet == true){
        printf("It is digit");
    }
    else
    {
        printf("It is not digit");
    }
    return 0;
}