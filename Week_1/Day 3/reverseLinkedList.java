import java.util.*;
/*
 * 206. REVERSE LINKED LIST 
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Example: Input: head = [1,2,3,4,5]                       Output: [5,4,3,2,1]
 * 
 */



 /*
  * This problem can be solved in two different ways,
            i) Iterative Approach
            ii) Recursive Approach
    Here, I have used the Iterative approach to solve this problem which is very simple by just adding the eleemts from last into a new linkedList
    We can do some internal transformation to reverse the LinkedList in the following days.
  */
public class reverseLinkedList {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        LinkedList<Integer> list = new LinkedList();
        for(int i : a){
            list.add(i);
        }
        System.out.println(reverseList(list));
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
       LinkedList<Integer> reversedList = new LinkedList();

       for(int i=list.size()-1;i>=0;i--){
        reversedList.add(list.get(i));
       }
       return reversedList;
    }
}

/*
 * LEETCODE SOLUTION :
 * 
 * 
 *  class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}


 */
