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