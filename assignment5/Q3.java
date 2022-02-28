import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class Q3 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int width = queue.size();
            maxWidth = Math.max(maxWidth, queue.getLast().val - queue.getFirst().val + 1);
            while (width > 0) {
                width--;
                TreeNode node = queue.remove();
                if (node.left != null) {
                    node.left.val = node.val * 2 + 1;
                    queue.add(node.left);
                }
                if (node.right != null) {
                    node.right.val = node.val * 2 + 2;
                    queue.add(node.right);
                }

            }
        }
        return maxWidth;
    }
}
