public class Q1 {
    int dfs(TreeNode root,int sum){
        int res=0;
        if(root==null)return res;
        if(root.val==sum)res++;
        res+=dfs(root.left,sum-root.val);
        res+=dfs(root.right,sum-root.val);
        return res;
    }
    public int pathSum(TreeNode root, int sum) {
        int res=0;
        if(root==null)return res;
        return dfs(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
}
