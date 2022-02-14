public class Q6 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        for(int i=0; i<n-1; i++){
            fast = fast.next;
        }

        if(fast.next == null){
            return head.next;
        }
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;
        slow.next = null;
        return head;
    }
}
