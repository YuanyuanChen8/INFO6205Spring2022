public class Q3 {
    int path = 0;

    public int longestUnivaluePath(TreeNode root) {

        if (root == null)
            return 0;

        treeTraverse(root, 0);
        return path;
    }

    private int treeTraverse(TreeNode root, int pre) {

        if (root == null)
            return 0;

        int left = treeTraverse(root.left, root.val);
        int right = treeTraverse(root.right, root.val);

        path = Math.max(left + right, path);

        if (root.val == pre)
            return Math.max(left, right) + 1;
        return 0;
    }
}
