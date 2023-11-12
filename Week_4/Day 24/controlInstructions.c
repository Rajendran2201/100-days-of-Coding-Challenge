#include <stdio.h>

int main(){


/*

    The control instruction are of four types and they are as follows 

    1. Sequence controls 
    2. Decision controls
    3. loop controls
    4. Case controls 

*/
// let us write a C program to get an input from the user and check if the number given is divisible by 97 or not 

    int a;
    printf("Enter a number:");
    scanf("%d",&a);

    if(a%97==0){
       printf("The given number is  divisible by 97");
    }else{
       printf("The given number is not divisible by 97");
    }






    return 0;
}