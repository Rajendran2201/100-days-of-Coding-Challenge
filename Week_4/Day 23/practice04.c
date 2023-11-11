#include <stdio.h>
#include<math.h>

void main() {
  float p,t,r,si,ci;

  printf("Enter the principal amount: ");
  scanf("%f",&p);
  printf("Enter the time in year: ");
  scanf("%f",&t);
  printf("Enter the rate of growth : ");
  scanf("%f",&r);
  
  if(p<0 || t<0 || r<0){
    printf("Please enter non-negative values");
  }

  si = (p*t*r)/100;
  ci = p*(pow(1+(r/100),t)-1);
  printf("Simple Interest : %f",si);
  printf("\nCompound Interest : %f",ci);
  
   
}
