#include<stdio.h>
void main(){
  int max,length1=0 , length2=0;
  char str1[100] , str2[100];
  printf("Enter the word-1: ");
  gets(str1);
  printf("Enter word-2: ");
  gets(str2);

  //finding the length of the string 
  for(int i = 0; str1[i] != '\0' ; i++){
    length1++;
  }
  for(int i = 0; str2[i] != '\0' ; i++){
    length2++;
  }

  if(length1 != length2){
    printf("The Strings are not equal !");
    return;
  }

max = (length1 > length2) ? length1 : length2;

for(int i = 0; i<max; i++){
  if(str1[i]!=str2[i]){
     printf("The Strings are not equal !");
    return;
  }
}

 printf("The Strings are  equal !");

}