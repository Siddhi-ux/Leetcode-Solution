class Solution {
    int c=0;
    public boolean check(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
               c++;
            }if(c>1){
                return false;
            }
        }
        return true;
    
    }
}
