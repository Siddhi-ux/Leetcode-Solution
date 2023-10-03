class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res;
        int p = 0;
        res = new int[nums.length];
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[p] = nums[i];
                p++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                res[p] = nums[i];
                p++;
            }
        }
        
        return res;
    }
}
