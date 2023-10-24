import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int value  = fibo(n);

        System.out.println("The factorial of the given number is "+value);
       
    }

    private static int fibo(int n) {
        int value;

        if(n<2){
            return n;
        }

        value = fibo(n-1) + fibo(n-2);

        return value;
    }
}