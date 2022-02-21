public class Q2 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode node1 = dummy1;
        ListNode node2 = dummy2;

        ListNode cur = head;
        while(cur != null) {
            if(cur.val >= x) {
                node1.next = cur;
                node1 = node1.next;
                cur = cur.next;
                node1.next = null;
            } else {
                node2.next = cur;
                node2 = node2.next;
                cur = cur.next;
                node2.next = null;
            }
        }
        node2.next = dummy1.next;
        return dummy2.next;

    }
}
