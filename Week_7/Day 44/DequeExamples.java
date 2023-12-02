import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(34);
        deque.addFirst(87);
        deque.add(8);
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}
