import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> result=new LinkedList<>();
        queue.add(root);
        while(queue.size()>0)
        {
            List<Integer> temp=new ArrayList<>();
            int count=queue.size();
            while(count-->0)
            {
                TreeNode node=queue.poll();
                if(node==null)
                {
                    continue;
                }
                temp.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if(temp.size()>0)
            {
                result.add(0,temp);
            }
        }
        return result;
    }


}
