#include<stdio.h>
int main(){
    
    int array[5],max,min;
    
    for(int i=0;i<5;i++){
    printf("Enter the elements of array[%d]: ",i);
    scanf("%d",&array[i]);
    }
    
     max = findMaximum(array);
     min = findMinimum(array);
    
    printf("The maximum value of the array is %d",max);
    printf("\nThe minimum value of the array is %d",min);
    
    return 0;
}

int findMaximum(int array[5]){
    int max = array[0];

    for(int i=1;i<5;i++){
        if(array[i]>max){
            max = array[i];
        }
    }
    return max;
}
int findMinimum(int array[5]){
    int min = array[0];

    for(int i=1;i<5;i++){
        if(array[i]<min){
            min = array[i];
        }
    }
    return min;
}