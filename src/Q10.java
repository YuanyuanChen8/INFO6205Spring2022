public class Q10 {
    public int pairSum(ListNode head) {
        if(head.next.next == null) return head.val + head.next.val;
        ListNode slow = head,fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;;
            fast = fast.next.next;
        }
        ListNode L = slow.next;

        while(L.next != null){
            ListNode m = L.next.next;
            L.next.next = slow.next;
            slow.next = L.next;
            L.next = m;
        }
        int max = 0;
        ListNode N = head;
        slow = slow.next;

        while(slow != null){
            max = Math.max(max,N.val + slow.val);
            N = N.next;
            slow = slow.next;
        }
        return max;
    }
}
