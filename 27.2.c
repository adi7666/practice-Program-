#include<stdio.h>

int CountCaptital(char *str){
    int iCnt = 0;
    int iCount = 0;

    while(*str != '\0'){
        // printf("%c\n", *str);
        if(*str >= 97 && *str <=122 ){
            iCount++;
        }
        str++;
    }
    return iCount;
} 
int main(){
    char arr[20];
    int iRet = 0;
    printf("Enter String : ");
    scanf("%[^'\n']s", arr);

    iRet = CountCaptital(arr);
    printf(" The Capital Character in this are : %d",iRet);

    return 0;
}