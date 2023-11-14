public class recursion_04 {
    public static void main(String[] args) {
        int n = 12;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
       
    }
}


/*
 * Here the base condition is 
 * 
 *  if(n==0){
            return;
        }
 * 
 * The function basically prints the numbers from 1 to n ; 
 * This is because the function is called before printing the value of n 
 * when it reaches 0 , it gets terminated 
 * 
 */