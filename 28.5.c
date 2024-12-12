#include<stdio.h>
#include<stdlib.h>

int CountWhite(char *str)
{
    int Count =0;
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            Count++;
        }
        
        str++;
    }
    return Count;
}

int main()
{
    char Arr[20];
    int iRet = 0;
    printf("Enter String \n");
    scanf("%[^\n]s", Arr);

    iRet = CountWhite(Arr);
    printf("Modified String is %d",iRet);
    return 0;
}