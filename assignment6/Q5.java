public class Q5 {
    Map<TreeNode, int[]> map = new HashMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map.put(root, new int[]{0, 0, root.val});
        dfs(root);
        List<int []> list = new ArrayList<>(map.values());
        Collections.sort(list, (a,b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            if(a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int n = list.size();
        for(int i = 0;i < n; ){
            int j = i;
            List<Integer> tmp = new ArrayList<>();
            while(j < n && list.get(j)[0] == list.get(i)[0]){
                tmp.add(list.get(j++)[2]);
            }
            ans.add(tmp);
            i = j;
        }
        return ans;
    }

    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        int[] info = map.get(node);
        int col = info[0];
        int row = info[1];
        int val = info[2];
        if(node.left != null){
            map.put(node.left, new int[]{col - 1, row + 1, node.left.val});
            dfs(node.left);
        }
        if(node.right != null){
            map.put(node.right, new int[]{col + 1, row + 1, node.right.val});
            dfs(node.right);
        }
    }
}
