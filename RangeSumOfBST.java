class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        //Base Condition
        if (root == null)
            return -1;
        //
        if (low < root.val)
            rangeSumBST(root.left, low, high);
       
        if (root.val >= low && root.val <= high)
            sum += root.val;

        //
        if (high > root.val)
            rangeSumBST(root.right, low, high);
        return sum;

    }
}
