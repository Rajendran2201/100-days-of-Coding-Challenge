
class getDecimal extends ListNode{
    public int getDecimalValue(ListNode head) {
        int total = 0;
        ListNode p = head;
        while (p != null) {
            total = (total * 2) + p.val;
            p = p.next;
        }
        return total;
    }
}
