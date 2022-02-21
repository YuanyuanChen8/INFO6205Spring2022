public class Q3 {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode q = head;
        int amount = 0;
        while (q != null) {
            amount++;
            q = q.next;
        }
        ListNode p = head;
        int height = 1;
        ListNode pre = null;
        while (p != null) {
            if (height <= amount) {
                amount -= height;
            } else {
                height = amount;
            }
            if (height % 2 == 1) {
                int num = 0;
                if (pre != null) {
                    pre.next = p;
                }
                while (p != null && num < height) {
                    num++;
                    pre = p;
                    p = p.next;
                }
            } else {
                ListNode pnew = null;
                ListNode pnext = null;
                int num = 0;
                ListNode ptmp = null;
                while (p != null && num < height) {
                    num++;
                    pnext = p.next;
                    p.next = pnew;
                    pnew = p;
                    if (num == 1) {
                        ptmp = pnew;
                    }
                    p = pnext;
                }
                pre.next = pnew;
                if (ptmp != null) {
                    pre = ptmp;
                }
            }
            height++;
        }
        return head;

    }
}
