#include<stdio.h>
#include<stdbool.h>

bool ChkChar(char *str, char ch)
{
    bool bflag = false;
    while (*str != '\0')
    {
        /* code */
        if(*str == ch)
        {
            bflag = true;
            break;
        }
        return bflag;
    }
    
}

int main()
{
    char Arr[30];
    char ch = '\0';
    bool bRet = false;
    printf("Enter the string : \n");
    scanf("%[^'\n']s", &Arr);

    printf("ENter the char : \n");
    scanf("  %c", &ch);

    bRet = ChkChar(Arr, ch);
    if(bRet == true){
        printf("true");
    }
    else{
        printf("false");
    }

    return 0;
}