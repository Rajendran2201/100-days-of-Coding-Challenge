public class recurPractice01 {

     /* the problem statement is to print hello world 10 times using a recursive function


     A recursive function usually have three parts namely 

     1. Termination condition
     2. Business logic
     3. Recursive function call

      */

    public static void main(String[] args) {
       printHelloWorld(1);
    }

    private static void printHelloWorld(int i) {
        if(i>10){                                   // termination / base condition 
            return;
        }
        System.out.println(i+". Hello,World!");     // Business logic
        printHelloWorld(i+1);                       // calling the function recursively by varying the input 
        
    }
}
