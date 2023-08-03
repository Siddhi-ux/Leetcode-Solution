class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans =new int[n];
        int j=0,k=1;
        for(int i: nums){
            if(i>0){
                ans[j]=i;
                j+=2;
            }else{
             ans[k]=i;
             k+=2;
            }
        }
        return ans;
    }
}
