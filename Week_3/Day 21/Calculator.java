import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator : ");
        char c = sc.next().charAt(0);
         System.out.print("Enter the Number 1 : ");
         int num1 = sc.nextInt(); 

          System.out.print("Enter the Number 2 : ");
          int num2 = sc.nextInt();

          switch(c){
            case '+':
                System.out.println("The sum of the two numbers is "+(num1+num2)) ;
                break;
            case '-':
                System.out.println("The difference of the two numbers is "+(num1-num2)) ;
                break;
            case '*':
                System.out.println("The product of the two numbers is "+(num1*num2)) ;
                break;
          case '/':
            if(num2==0){
                System.out.println("Division cannot be done by zero ");
                return;
            }
                System.out.println("The quotient of the two numbers is "+(num1*num2)) ;
                break;
            default: 
                System.out.println("Enter a valid Operation ");
          
          }
    }
}