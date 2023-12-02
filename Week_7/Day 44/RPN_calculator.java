import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RPN_calculator {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        while(true){
            String input = in.nextLine();
            char ch = input.charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                double y = Double.parseDouble(stack.pop());
                double x = Double.parseDouble(stack.pop());
                double z = 0;
                switch(ch){
                    case '+': z=x+y; break;
                    case '-': z=x-y; break;
                    case '*': z=x*y; break;
                    case '/': z=x/y;
                }
                System.out.println(x+" "+ch+" "+y+" = "+z);
                stack.push(new Double(z).toString());
            } else if (ch=='q' || ch=='Q') {
                return;
            }else{
                stack.push(input);
            }
        }

    }
}
