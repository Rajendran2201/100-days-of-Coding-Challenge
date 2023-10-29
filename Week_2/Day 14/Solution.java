
public class Solution {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 0 -> 1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;

        ListNode solution = new ListNode();
        int decimalValue = solution.getDecimalValue(node1);
        System.out.println("Decimal Value: " + decimalValue); // Output should be 5
    }
}
