import java.util.Scanner;
public class SingleInheritance{
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();

        CheckPositiveNegative chk = new CheckPositiveNegative(num);
        


    }
}