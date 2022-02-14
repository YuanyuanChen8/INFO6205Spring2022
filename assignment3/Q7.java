public class Q7 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode oddList = head, evenList = head.next, oddNode = oddList, evenNode = evenList;
        while(evenNode != null && evenNode.next != null){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode == null ? null : oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenList;
        return oddList;
    }
}
