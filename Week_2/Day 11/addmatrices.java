
import java.util.Scanner;
public class addmatrices{
public static void main(String args[]){

 Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int row=sc.nextInt();
System.out.println("Enter the number of columns:");
int col=sc.nextInt();
//declare arrays a,b,c
int a[][]=new int [row][col];
int b[][]=new int [row][col];
int c[][]=new int [row][col];
 //get values of array a
for(int i=0; i<row;i++){
    for(int j=0;j<col;j++){
System.out.println("Enter the value of a[]"+i+"][]"+j+"]:");
a[i][j]=sc.nextInt();
}
}
//get values of array b
for(int i=0; i<row;i++){
for(int j=0;j<col;j++){
 System.out.println("Enter the value of b[]"+i+"][]"+j+"]:");
b[i][j]=sc.nextInt();
}
 }
 //add the elements of two arrays
for(int i=0; i<row;i++){
for(int j=0;j<col;j++){
System.out.print(a[i][j]+b[i][j]+"  ");

 }
 System.out.println();
}
 }
}