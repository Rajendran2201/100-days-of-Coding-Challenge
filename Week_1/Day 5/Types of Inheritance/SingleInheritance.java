/*
 Java Program to find whether the given number is positive or Negative along with Odd or Even uing Single Inheritance 

 1) Base Class - CheckOddEven which contains a method named "OddOrEven" which evaluates whether the number is odd or even
 2) Derived Class - CheckPositiveNegative it checks whether the given number is POsitive or Negative immediately on the 
 creation of Object as the code is written within the Constructor.

 The Constructor of the derived class uses the method (OddOrEven) from its parent class. 
 When a subclass is derived from a parent class, It is said to be Single Inheritance 


*/

import java.util.Scanner;
public class SingleInheritance{
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        CheckPositiveNegative chk = new CheckPositiveNegative(num);
        


    }
}
