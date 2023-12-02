import java.util.Stack;

public class insertionDeletionInstacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
 // to add an element into a stack , we must use a function called push() which inserts an element into the existing stack
        stack.push(35);
        stack.push(90);
        stack.push(67);
        stack.push(44);
        stack.push(76);

        System.out.println(stack);  // Internally a stack is also an array !
        // When you print a stack , it will be printed in an array format

// to remove an element from stack , use pop() which actually removes the last element from the stack
        // pop function returns an integer such that we can print the last element of the stack using pop()
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //System.out.println(stack.pop());
 //when we try to remove an element using pop() from an empty stack , it gives an exception called "EmptyStackException"

    }
}

