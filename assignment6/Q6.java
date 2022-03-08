public class Q6 {
    public int countNodes(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if(root != null) list.add(root);
        int count = 0;
        int index = 0;


        while(index < list.size()) {
            count ++;
            TreeNode node = list.get(index ++);
            if(node.left != null) list.add(node.left);
            if(node.right != null) list.add(node.right);
        }

        return count;
    }

}
