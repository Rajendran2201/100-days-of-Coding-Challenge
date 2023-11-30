#include<stdio.h>
void printBill(int modelOfTV,int numberOfBoxes, int numbers){
    printf("\n\nWELCOME TO TELEVISION STORE\n ---------Bill---------\n");
    printf("The customer requested Model No:%d",modelOfTV);
    printf("\nThe customer requested %d boxes",numberOfBoxes);
    printf("\nThere are %d boxes left",numbers);
}
int checkBalance(int numberOfBoxes,int balance){
    if(numberOfBoxes>balance){
                printf("Sorry, There are limited number of boxes! \n We are left with only %d boxes...",balance);
                return -1;
            }
    return 0;
}
int main(){
    int ans,modelOfTV,numberOfBoxes,foundElement=0;
    int numbers[5]={98,79,65,45,17};
    int models[5]={17,22,26,32,40};
    printf("\tITEMS AVAILABLE IN TELEVISION STORE  \n TV_LCD_17 : 1 : 98 \n TV_LCD_22 : 2 : 79 \n TV_LCD_26 : 3 : 65\n TV_LCD_32 : 4 : 45\n TV_LCD_40 : 5 : 17\n");
    printf("\nEnter the TV_Model number: ");
    scanf("%d",&modelOfTV);
    for(int i=0;i<5;i++){
        if(modelOfTV==models[i]){
            foundElement=1;
        }
    }
    if(foundElement==0){
        printf("Invalid Box Type !");
        return 0;
    }
        printf("Enter the number of boxes : ");
        scanf("%d",&numberOfBoxes);
   
    switch(modelOfTV){
        case 17:
            ans=checkBalance(numberOfBoxes,numbers[0]);
            if(ans!=-1){
            numbers[0]=numbers[0]-numberOfBoxes;
            printBill(modelOfTV,numberOfBoxes,numbers[0]);
            }
            break;

        case 22:
            ans=checkBalance(numberOfBoxes,numbers[1]);
            if(ans!=-1){
            numbers[1]=numbers[1]-numberOfBoxes;
            printBill(modelOfTV,numberOfBoxes,numbers[1]);}
            break;
        case 26:
            ans=checkBalance(numberOfBoxes,numbers[2]);
            if(ans!=-1){
            numbers[2]=numbers[2]-numberOfBoxes;
            printBill(modelOfTV,numberOfBoxes,numbers[2]);}
            break;
        case 32:
            ans=checkBalance(numberOfBoxes,numbers[3]);
            if(ans!=-1){
            numbers[3]=numbers[3]-numberOfBoxes;
            printBill(modelOfTV,numberOfBoxes,numbers[3]);}
            break;
        case 40: 
            ans=checkBalance(numberOfBoxes,numbers[4]);
            if(ans!=-1){
            numbers[4]=numbers[4]-numberOfBoxes;
            printBill(modelOfTV,numberOfBoxes,numbers[4]);}
            break;
        default: 
            printf("Invalid Box Type !");
    }
    
    return 0;
}
