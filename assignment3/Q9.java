import java.util.ArrayList;
import java.util.Stack;

public class Q9 {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> nums = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int [] res;

        for(ListNode node = head; node != null; node = node.next)
            nums.add(node.val);

        res = new int[nums.size()];

        for(int i=0; i<nums.size(); i++)
        {
            while(!stack.isEmpty() && nums.get(stack.peek()) < nums.get(i))
                res[stack.pop()] = nums.get(i);

            stack.push(i);
        }

        return res;
    }
}
