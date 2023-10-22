/*
    This is the leetcode solution for the problem 876.FIND THE MIDDLE ELEMENT 

*/

class Solution_middleElement {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head; //using the tortooise and the rabbit approach 
        while(fast!=null && fast.next!=null){
            slow = slow.next;            //slow pointer moves by 1
            fast = fast.next.next;        //fast pointer moves by 2

            //such that when fast pointer reaches the end of the list , the slow pointer will be at the middle of the list
        }
        return slow;  // slow returns the list where the head will be the middle node 
    }
    
}
