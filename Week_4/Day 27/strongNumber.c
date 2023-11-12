
#include <stdio.h>
int fact(int num){
    int product=1;
    for(int i=1;i<num+1;i++){
        product*=i;
    }
    return product;
}
int main() {
   //program to check if the number is a strong number or not
   int num,org_num;
   printf("Enter the number:");
   scanf("%d",&num);
    org_num = num;
    
   int sum = 0;
   while(num>0){
       int rem = num%10;
       int factorial = fact(rem);
       sum+=factorial;
       num/=10;
   }
   if(org_num==sum){
       printf("It is a Strong Number");
   }else{
       printf("It is not a Strong Number");
   }
    return 0;
}
