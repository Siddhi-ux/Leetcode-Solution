class Solution {
    public int missingNumber(int[] nums) {
       
        int e=0;
        for(int i=1;i<=nums.length;i++){
            e^=i;
        }
        int a=0;
        for(int num : nums){
            a^=num;
        }
        return a^e;
    
    }
}
