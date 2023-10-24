import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int factorial = fact(n);

        System.out.println("The factorial of the given number is "+factorial);
    }

    private static int fact(int n) {

        if(n < 2){
            return 1;
        }

        int result = n*fact(n-1);


        return result;
    }
}