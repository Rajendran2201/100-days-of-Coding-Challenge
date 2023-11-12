//Write a C Program to determine whether a given number is an automorphic number or not.


#include <stdio.h>

int main() {
    //Automorphic number 
    int num, product, count=0; 
    printf("Enter the number:");
    scanf("%d",&num);
    product = num * num;
    int dup_num = num;
    while(dup_num>0){
        count++;
        dup_num/=10;
    }
    int divisor = 1;
  for(int i =0; i<count;i++){
      divisor *= 10;
  }
   int new_num = product % divisor ;
    if(num==new_num){
        printf("It is an automorphic number !");
    }else{
        printf("It is not an automorphic number....");
    }
    return 0;
}
