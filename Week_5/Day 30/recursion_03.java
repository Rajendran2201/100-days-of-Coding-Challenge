public class recursion_03 {
    public static void main(String[] args) {
        int n = 12;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}

/*
 * Here the base condition is 
 * 
 *  if(n==0){
            return;
        }
 * 
 * The function basically prints the numbers from n to 1 ; 
 * when it reaches 0 , it gets terminated 
 * 
 */