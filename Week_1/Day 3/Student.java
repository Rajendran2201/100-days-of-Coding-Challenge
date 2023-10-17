/*Let's Start with the concept of Object oriented programming
 * 
 * Firstly, lets start with the learning how to create classes, objects and methods. Then we shall learn to access the values from them 
 * Later we can proceed with the four pillars of OOP's :
 *              i)      Abstraction
 *              ii)     Data Encapsulation
 *              iii)    Polymorphism
 *              iv)     Inheritance 
 * 
 * 
 */

public class Student {
    int rollno;
    String studentName;
    int mark;
    String phoneNo;

    public static void main(String[] args) {
        Student s = new Student();
        s.rollno=1;
        s.studentName="Raj";
        s.mark=99;
        s.phoneNo ="9797324232";
            System.out.println("The Student name is " + s.studentName
                    + "\nThe roll no is " + s.rollno
                    + "\nThe mark of the student is " + s.mark
                    + "\nThe phone no of the student is " + s.phoneNo);
    }
}
