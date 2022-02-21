public class Q8 {
    public ListNode[] splitListToParts(ListNode root, int k) {

        ListNode cur=root;
        int l=0;
        while(cur!=null){
            l++;
            cur=cur.next;
        }

        int size=l/k;
        int mod=l%k;

        ListNode[] ans=new ListNode[k];
        cur=root;

        for(int i=0;cur!=null&&i<k;i++){
            ans[i]=cur;
            int cursize=size+(mod-->0?1:0);
            for(int j=0;j<cursize-1;j++){
                cur=cur.next;
            }

            ListNode next=cur.next;
            cur.next=null;
            cur=next;
        }
        return ans;
    }
}
