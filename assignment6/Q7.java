public class Q7 {
    static int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        childSum(0, root);
        return sum;
    }
    public static void  childSum(int val, TreeNode root) {
        if(root == null) return;
        int k = (val * 10 + root.val) ;
        if(root.left == null && root.right == null) {
            sum += k;
        }
        childSum(k, root.left);
        childSum(k, root.right);
    }
}
