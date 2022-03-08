public class Q8 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return root;
        }
        find(root, root.left, target, 1);
        find(root, root.right, target, 2);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    private boolean find(TreeNode f, TreeNode root, int target, int flag) {
        if (root == null) {
            return true;
        }
        boolean b1 = find(root, root.left, target, 1);
        boolean b2 = find(root, root.right, target, 2);
        if (b1 && b2 && target == root.val) {
            if (flag == 1) {
                f.left = null;
            } else {
                f.right = null;
            }
            return true;
        }
        return false;
    }
}
