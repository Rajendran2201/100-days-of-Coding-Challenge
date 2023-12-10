#include<stdio.h>

int main(){
    // concatenate two strings 
    char str1[100] , str2[100];
    printf("Enter the word-1: ");
    gets(str1);
    printf("\nEnter the word-2: ");
    gets(str2);
    for(int i=0; str1[i] != '\0';i++){
        printf("%c",str1[i]);
    }
    for(int i=0; str2[i] != '\0';i++){
        printf("%c",str2[i]);
    }
}