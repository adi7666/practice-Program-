#include<stdio.h>

int CountChar(char *str, char ch)
{
    int iCnt = 0;
    while(*str != '0')
    {
        if(ch == *str)
        {
            iCnt++;
        }
        str++;
    }
    return iCnt;
}

int main()
{
    char Arr[20];
    char cValue;
    int iRet =0;
    printf("Enter Steing\n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the Character");
    scanf(" %c",&cValue);

    iRet = CountChar(Arr, cValue);

    printf("Character Frequency is %d", iRet);

    return 0; 
}