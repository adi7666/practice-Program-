#include<stdio.h>
#include<stdlib.h>

void StrtoggleX(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'a' && *str <='z')
        {
            *str -= 32;
        }
        else if(*str >= 'A' && *str <='Z')
        {
            *str += 32;
        }
        str++;
    }
}

int main()
{
    char Arr[20];
    printf("Enter String \n");
    scanf("%[^\n]s", Arr);

    StrtoggleX(Arr);
    printf("Modified String is %s",Arr);
    return 0;
}