public class Q4 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int dist = 0;
        ListNode curr = head.next;
        ListNode pre = head;

        while(curr.next != null){
            if((pre.val > curr.val && curr.next.val > curr.val) || (pre.val < curr.val && curr.next.val < curr.val)){
                arr.add(dist);
            }

            dist++;
            pre = curr;
            curr = curr.next;
        }

        if(arr.size() <=  1) {
            int[] ans = new int[2];
            ans[0] = -1;
            ans[1] = -1;

            return ans;
        }

        int mind = Integer.MAX_VALUE;
        int last = -1;

        for(int val : arr){
            if(last == -1)
                last = val;
            else {
                if(mind > (val - last))
                    mind = val - last;
                last = val;
            }
        }

        int[] ans = new int[2];
        ans[0] = mind;
        ans[1] = arr.get(arr.size() - 1) - arr.get(0);

        return ans;
    }

}
