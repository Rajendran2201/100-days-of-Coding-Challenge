#include<stdio.h>

int main(){
    //Copy the string from one variable to another
    char original_string[100] , duplicate_string[100];
    
    printf("Enter the word : ");
    gets(original_string);
    
    for(int i=0; original_string[i] != '\0' ; i++){
        duplicate_string[i] = original_string[i];
    }
    printf("%s",duplicate_string);
}