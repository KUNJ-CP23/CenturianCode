// 2 WAP to find whether string is palindrome or not. 
// D-3

#include <stdio.h>
#include <string.h>

int main(){
    char str[100];
    int len, i;
    int isPalidrome = 1;

    printf("Enter a string: ");
    // fgets is for taking string input with spaces where str is string, 
    // sizeof is for size of string, stdin is standard input
    fgets(str,sizeof(str),stdin);

    len = strlen(str);

    for(i=0; i<len/2; i++){
        if(str[i] != str[len-i-2]){ // len-i-2 because last character is \n
            isPalidrome = 0;
            break;
        }
    }
    if(isPalidrome){
        printf("The string is Palindrome\n");
    } else {
        printf("The string is not Palindrome\n");
    }
}