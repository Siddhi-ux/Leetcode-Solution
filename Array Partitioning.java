class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=1;i<nums.length;i+=2){
            s+=Math.min(nums[i],nums[i-1]);
        }
        return s;
    }
   
}
