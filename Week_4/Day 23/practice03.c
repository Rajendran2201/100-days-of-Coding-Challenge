#include<stdio.h>
int main(){
    float tempC, tempF;

    printf("Enter the temperature in Celcius :");
    scanf("%f",&tempC);

    tempF = tempC*1.8 +32;

    printf("The temperature in Farenheit is %f",tempF)

    return 0;
}