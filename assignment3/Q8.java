public class Q8 {
    public Node insert(Node head, int insertVal) {

        if (head == null) {
            Node insertNode = new Node(insertVal);
            insertNode.next = insertNode;
            return insertNode;
        }

        if (head.next == head) {
            Node insertNode = new Node(insertVal);
            head.next = insertNode;
            insertNode.next = head;
            return head;
        }

        Node min = head;
        Node max = head;
        Node index = head.next;
        while (head != index) {
            if (min.val > index.val) min = index;
            if (max.val <= index.val) max = index;
            index = index.next;
        }

        if (insertVal <= min.val || insertVal >= max.val) {
            Node tmp = new Node(insertVal);
            max.next = tmp;
            tmp.next = min;
            return head;
        }

        Node cur = head.next;
        Node pre = head;
        while (true) {
            if (insertVal > pre.val && insertVal <= cur.val) {
                pre.next = new Node(insertVal);
                pre.next.next = cur;
                return head;
            }
            pre = cur;
            cur = cur.next;
        }
    }
}
