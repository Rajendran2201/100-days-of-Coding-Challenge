#include <stdio.h>
int main() {

    
    /*
    
    Write a C program to get three values as an input and 
    print the greatest and smallest number possible on the combination of the three numbers.
*/




    //get the inputs
    int num1, num2, num3;
    printf("Enter Number-1: ");
    scanf("%d",&num1);
    printf("Enter Number-2: ");
    scanf("%d",&num2);
    printf("Enter Number-3: ");
    scanf("%d",&num3);
    
    //sort the numbers
    int greatest, greater, smallest;
    if(num1>num2 && num1>num3){
        greatest = num1;
        if(num2>num3){
            greater = num2;
            smallest = num3;
        }else{
            greater = num3;
            smallest = num2;
        }
    }else if (num2>num1 && num2>num3){
        greatest = num2;
        if(num3>num1){
            greater = num3;
            smallest = num1;
        }else{
            greater = num1;
            smallest = num3;
        }
    }else{
        greatest = num3;
        if(num1>num2){
            greater = num1;
            smallest = num2;
        }else{
            greater = num2;
            smallest = num1;
        }
    }
    
   //print greatest and smallest three digit number 
   int greatest_number = greatest*100 + greater*10 + smallest;
   int smallest_number = smallest*100 + greater*10 + greatest;
   
   printf("Greatest three digit number : %d",greatest_number);
   printf("\nSmallest three digit number :%d",smallest_number);
    return 0;
}
