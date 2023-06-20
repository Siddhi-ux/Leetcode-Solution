class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //Approach: using extra space, T.C: O(n), S.C: O(n)
        //Idea: We know, inorder traversal in a binary search tree gives a sorted list
        //so, we can add the values in a ArrayList, then we can get the value by index

        //initialize a ArrayList
        ArrayList<Integer> res = new ArrayList<>();
        //call inOrder function
        inOrder(root, res);
        //k-1 because, in question it was mentioned that 1-indexed, but ArrayList is 0 indexed
        return res.get(k-1);


    }
    public void inOrder(TreeNode root, List<Integer> res){
        if(root==null) return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
}
