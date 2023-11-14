public class recursion_02 {
    public static void main(String[] args) {
        printName(10);
    }
    public static void printName(int j){
        if(j==0){
            return;
        }
        System.out.println("Hello guys!");
        printName(j-1);
    }
}

// this is a recursive function to print the statement "Hello guys" 10 times 
// here the base condition is when j becomes equal to 0 then the function is returned 
// each time the function is called, the value of j is decremented by 1
