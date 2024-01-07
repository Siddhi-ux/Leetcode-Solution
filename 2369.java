class Solution {
    public boolean isPairEqual(int index,int []nums) {
        return nums[index] == nums[index+1];
    }
    public boolean isTripleEqual(int index,int []nums) {
        return nums[index] == nums[index+1] && nums[index] == nums[index+2];
    }
    public boolean isTripleConsecutive(int index,int []nums) {
        return nums[index] + 1 == nums[index+1] && nums[index+1] + 1 == nums[index+2];
    }
    public boolean recSol(int index,int []nums) {
        //if traversing of array is completed then return true
        if(index == nums.length) return true;
        //if we are at last element of array then we can not create partition as there are no condition for subarray of size one
        if(index == nums.length - 1) return false;
        //if we have only two elements remaining then we have to check whether that two are equal or not
        if(index == nums.length - 2) return isPairEqual(index,nums);
        //otherwise check all 3 conditions and move to new index accordingly
        boolean isTwo = isPairEqual(index,nums) && recSol(index+2,nums);
        boolean isThree = (isTripleEqual(index,nums) || isTripleConsecutive(index,nums)) && recSol(index+3,nums);
        return isTwo || isThree;
    }
    public boolean memoSol(int index,int []nums,int []dp) {
        if(index == nums.length) return true;
        if(dp[index] != -1) return dp[index] == 1 ? true : false;
        if(index == nums.length - 1) return false;
        if(index == nums.length - 2) return isPairEqual(index,nums);
        boolean isTwo = isPairEqual(index,nums) && memoSol(index+2,nums,dp);
        boolean isThree = (isTripleEqual(index,nums) || isTripleConsecutive(index,nums)) && memoSol(index+3,nums,dp);
        dp[index] = isTwo || isThree ? 1 : 0;
        return isTwo || isThree;
    }
    public boolean dpSol(int []nums) {
        int []dp = new int[nums.length+1];
        dp[nums.length] = 1; // if(index == nums.length) return true;
        dp[nums.length-1] = 0; // if(index == nums.length - 1) return false;
        dp[nums.length-2] = isPairEqual(nums.length-2,nums) ? 1 : 0; //if(index == nums.length - 2) return isPairEqual(index,nums);
        for(int index=nums.length-3;index>=0;index--) {
            dp[index] = isPairEqual(index,nums) && dp[index+2] == 1 ? 1 : 0; // isPairEqual(index,nums) && memoSol(index+2,nums,dp);
            if(dp[index] == 0) {
                dp[index] = (isTripleEqual(index,nums) || isTripleConsecutive(index,nums)) && dp[index+3] == 1 ? 1 : 0; //(isTripleEqual(index,nums) || isTripleConsecutive(index,nums)) && memoSol(index+3,nums,dp);
            }
        }
        return dp[0] == 1;

    }
    public boolean validPartition(int[] nums) {
        // return recSol(0,nums);
        // int []dp = new int[nums.length];
        // Arrays.fill(dp,-1);
        // return memoSol(0,nums,dp);
        return dpSol(nums);
    }
}
