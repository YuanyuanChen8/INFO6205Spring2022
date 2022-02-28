import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> hash = new HashMap<>();

        int maxHeight = dfs(root, hash);
        for(int i = 1; i <= maxHeight; i++) {
            res.add(hash.get(i));
        }

        return res;
    }

    public int dfs(TreeNode root, Map<Integer, List<Integer>> hash) {
        if(root == null) return 0;
        int height = Math.max(dfs(root.left, hash), dfs(root.right, hash)) + 1;

        hash.putIfAbsent(height, new ArrayList<>());
        hash.get(height).add(root.val);

        return height;
    }

}
