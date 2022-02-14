import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        List<ListNode> list=new ArrayList<>();
        while(head!=null) {
            list.add(head);
            head=head.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i!=j)
                list.get(j).next=list.get(i);
            j--;
        }
        list.get(i).next=null;
    }
}
