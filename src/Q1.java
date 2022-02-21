public class Q1 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;

        while (a-- > 1) {
            cur1 = cur1.next;
            b--;
        }
        ListNode prev = cur1;
        while (b-- > 0) {
            cur1 = cur1.next;
        }
        ListNode next = cur1.next;

        prev.next = list2;
        while (cur2.next != null) {
            cur2 = cur2.next;
        }
        cur2.next = next;
        return list1;

    }
}
