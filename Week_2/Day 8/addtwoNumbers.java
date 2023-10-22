/*
        This is the leetcode solution for 2. ADD TWO NUMBERS 

        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [0], l2 = [0]
Output: [0]

*/

public class addtwoNumbers {
        public ListNode addTwo(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int sum = 0;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                sum += carry;
                carry = sum / 10;
                ListNode node = new ListNode(sum % 10);
                temp.next = node;
                temp = temp.next;
            }
    
            return dummy.next;
        }
    }
