class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<(1<<n);i++){
            int x=0;
            for(int j=0;j<n;j++){
                if((i & (1<<j)) !=0){
                    x^=nums[j];
                }
            }
            res +=x;
        }
        return res;
    }
}
