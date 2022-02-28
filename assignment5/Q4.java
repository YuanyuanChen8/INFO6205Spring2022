import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res, 0);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res, int d) {
        if (root == null) {
            return;
        }
        if (d == res.size()) {
            res.add(root.val);
        } else {
            res.set(d, Math.max(res.get(d), root.val));
        }
        preorder(root.left, res, d + 1);
        preorder(root.right, res, d + 1);
    }
}
