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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }
    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int l =0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            l +=root.left.val;
        }
        int lefts =sum(root.left);
        int rights =sum(root.right);
        return l+lefts+rights;
    }
}
