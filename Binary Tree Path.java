/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root != null) dfs(root,"",ans);
        return ans;
    }
    public void dfs(TreeNode root, String path, List<String> ans){
        if(root.left == null && root.right == null) ans.add(path+root.val);
        if(root.left != null) dfs(root.left, path+root.val+"->",ans);
        if(root.right != null) dfs(root.right, path+root.val+"->",ans);
    }
}
