#include<stdio.h>
#include<stdlib.h>

void StrlwrX(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'A' && *str <='Z')
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

    StrlwrX(Arr);
    printf("Modified String is %s",Arr);
    return 0;
}