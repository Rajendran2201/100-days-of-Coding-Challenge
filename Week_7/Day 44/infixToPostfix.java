import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class infixToPostfix {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression:");
        String line = scanner.nextLine();

        StringBuilder numBuilder = new StringBuilder();

        for (char ch : line.toCharArray()) {
            if (Character.isDigit(ch)) {
                numBuilder.append(ch);
            } else if (!numBuilder.toString().isEmpty()) {
                output.append(numBuilder.toString()).append(" ");
                numBuilder.setLength(0); // Clear the number builder
            }

            if ("+-*/".indexOf(ch) != -1) {
                while (!stack.isEmpty() && precedence(stack.peek().charAt(0)) >= precedence(ch)) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(Character.toString(ch));
            } else if (ch == '(') {
                stack.push(Character.toString(ch));
            } else if (ch == ')') {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop(); // Discard '('
            }
        }

        if (!numBuilder.toString().isEmpty()) {
            output.append(numBuilder.toString()).append(" ");
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        System.out.println("Postfix Expression: " + output);
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Lower precedence for other characters
    }
}
