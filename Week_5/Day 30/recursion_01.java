public class recursion_01{
    public static void main(String[] args) {
        printName();
    }

    public static void printName(){
        System.out.println("Hello guys!");
        printName();
    }
    
}


// here the function printName() calls itself again and again 
// but this type of functions are not really appreciated as they dont have an end resulting in an infinite loop
// a recursive function must have a base condition inorder to terminate the loop 