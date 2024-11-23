#include<stdio.h>


int CountCaptital(char *str){
    int iCnt = 0;
    int iCount =0;
    int iSCount = 0, iLCount= 0;

    while(*str != '\0'){
        // printf("%c\n", *str);
        
        if(*str >= 65 && *str <= 90){
            iLCount++;
        }
        if(*str >= 97 && *str <=122 ){
            iSCount++;
        }
        str++;
        iCount =iSCount - iLCount;
    }
    return iCount;
} 
int main(){
    char arr[20];
    int iRet = 0;
    printf("Enter String : ");
    scanf("%[^'\n']s", arr);

    iRet = CountCaptital(arr);
    printf(" The difference between small and capital characters: %d",iRet);

    return 0;
}