public class solution_addTwoNumbers {
    public static void main(String[] args) {
        // Create the two input linked lists: l1 = [2,4,3] and l2 = [5,6,4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Initialize the Solution class
        addtwoNumbers solution = new addtwoNumbers();

        // Calculate the sum of the two numbers
        ListNode result = solution.addTwo(l1, l2);

        // Print the output linked list: [7, 0, 8]
        System.out.print("Output: [");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if (result != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

   
}
