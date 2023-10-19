/*
            Thw Structure of Multilevel Inheritance A -> B -> C
            Here there will be 
                1)grandParent class - fetch name
                2) parent class - fetch age
                3) derived class - fetch mark

Point to be noted : In java, Class cannot acces the grandParent's members

*/

import java.util.Scanner;

public class MultilevelInheritance {
    public static void main(String[] args) {
        int rollno = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Roll No :");
        rollno = sc.nextInt();

        FetchMark f = new FetchMark();            // The derived class can acces the methods of the parent and grandParent classes
        f.printName(rollno);                        //method in grandparent class
        f.printAge(rollno);                         //method in parent class
        f.printMark(rollno);                        //method in Derived class
    }
}
