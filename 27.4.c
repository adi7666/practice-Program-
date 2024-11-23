#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool CHkVowel(char *str){
    int iCnt = 0;
    int iCount =0;
    // int iSCount = 0, iLCount= 0;

    while(*str != '\0'){
        // printf("%c\n", *str);
        
        if(*str == 65 || *str == 73 || *str == 79 || *str == 69 || *str == 85 || *str == 97 || *str == 101 || *str == 105 || *str == 111 || *str == 117 ){
            iCount++;
        }
        str++;
    }
    return iCount;
} 
int main(){
    char arr[20];
    bool bRet = false;  
    printf("Enter String : ");
    scanf("%[^'\n']s", arr);

    bRet = CHkVowel(arr);
    if(bRet == true){
        printf("Contain Vowel");
    }
    else{
        printf("There is no vowel");
    }
    // printf(" The difference between small and capital characters: %d",iRet);

    return 0;
}