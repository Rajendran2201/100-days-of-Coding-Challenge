import java.util.Scanner;

public class absolute {
    public static int absolute(int num) {
        if (num < 0) {
            int result = -num;
            return result;
        } else {
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int result = absolute(num);
        System.out.println("The absolute value of the given number is " + result);
    }
}
