class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if( Height(root) == -1) return false;
        return true;
        
    }
    public int Height(TreeNode root){
        if(root == null) return 0;
        int left =Height(root.left);
        int right = Height(root.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right) +1;
    }
}
