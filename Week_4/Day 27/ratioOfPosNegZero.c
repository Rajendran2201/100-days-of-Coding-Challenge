
#include <stdio.h>

int main() {
    //Given an array with positive, negative and zero. Find the ratio of them 
    int arr[8] = {1,-2,4,-5,0,6,0,5};
    int pos_count = 0;
    int neg_count = 0;
    int zero_count = 0;
     int elements = sizeof(arr)/sizeof(arr[0]);

    for(int i =0; I< elements;i++){
        if(arr[i]>0){
            pos_count++;
        }else if(arr[i]<0){
            neg_count++;
        }else{
            zero_count++;
        }
        
    }
   
    
    float pos_ratio = (float)pos_count / elements;
    float neg_ratio = (float)neg_count / elements;
    float zero_ratio = (float)zero_count / elements;
    
    printf("The ratio of positive numbers is %f",pos_ratio);
     printf("The ratio of negative numbers is %f",neg_ratio);
      printf("The ratio of zero  is %f",zero_ratio);
    return 0;
}
