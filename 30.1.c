#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool ChkAlpha(char ch)
{
    bool bflag = false;
    if(ch >= 'a' && ch <= 'z')
    {
        bflag = true;        
    }
    else if(ch >='A' && ch <= 'Z'){
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
        printf("It is Character");
    }
    else
    {
        printf("It is not Character");
    }
    return 0;
}
