/*
        876. FIND MIDDLE ELEMENT         (LEETCODE)
        
        Given the head of a singly linked list, return the middle node of the linked list.

        If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

*/

public class findMiddleElement {
        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    
            // Initialize the Solution class
            Solution_middleElement solution = new Solution_middleElement();
    
            // find the middle node
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

