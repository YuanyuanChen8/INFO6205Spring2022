public class Q9 {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : G){
            hs.add(num);
        }

        int res = 0;
        while(head != null){
            if(hs.contains(head.val) && (head.next == null || !hs.contains(head.next.val))){
                res++;
            }

            head = head.next;
        }

        return res;
    }
}
