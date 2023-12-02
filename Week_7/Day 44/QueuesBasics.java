import java.util.LinkedList;
import java.util.Queue;

public class QueuesBasics {
    public static void main(String[] args) {
       // Queue<Integer> queue = new Queue<>();
        // In JAVA, Queue is an interface and not a class therefore we cannot use the above piece of code
        Queue<Integer> queue = new LinkedList<>();
        //Queue is similar to a LinkedList therefore In java Queue is extended from the LinkedList class !
        queue.add(3);
        queue.add(9);
        queue.add(7);
        queue.add(78);
        queue.add(73);
        System.out.println(queue);

        //peek() is used to fetch the first element in the queue but doesn't remove it
        System.out.println(queue.peek());
        System.out.println(queue);

        //remove() is used to remove the first element from the queue
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
