public class findMiddleElement {
        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    
            // Initialize the Solution class
            Solution_middleElement solution = new Solution_middleElement();
    
            // Find the middle node
            ListNode middle = solution.middleNode(head);
    
            // Print the output: [3, 4, 5]
            System.out.print("Output: [");
            while (middle != null) {
                System.out.print(middle.val);
                middle = middle.next;
                if (middle != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

