/*
    This is the code implementation of the class "Construct" which has three constructors with varying number of parameters 
    such that they are called based on the number of arguments provided

    A constructor is called during the creation of an object
    
*/

package Constructors;
public class Construct{
    Construct(){
        System.out.println("Constructor is called !");
    }
    Construct(int val){
        System.out.println("The provided value is "+val);
    }
    Construct(String name, int age){
        System.out.println("Name :"+name+" Age: "+age);
    }
}
