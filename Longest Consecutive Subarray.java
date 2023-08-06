class Solution {
    public int longestConsecutive(int[] nums) {
        int n =nums.length;
        if(n==0){
            return 0;
        }
        int lon =1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int t : set){
         if(!set.contains(t-1)){
             int c=1;
             int x=t;
             while(set.contains(x+1)){
                 x=x+1;
                 c++;
             }
             lon = Math.max(lon,c);
         }
        }
        return lon;
    }
}
