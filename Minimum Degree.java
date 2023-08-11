class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> fm = new HashMap<>();
        Map<Integer, Integer> ic =new HashMap<>();
        int d =0;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            fm.put(nums[i], fm.getOrDefault(nums[i], 0) + 1);
            ic.putIfAbsent(nums[i], i);
            int currDegree = fm.get(nums[i]);
            if(currDegree>d){
                d =currDegree;
                min = i - ic.get(nums[i]) + 1;
            }else if (currDegree == d) {
                min = Math.min(min, i - ic.get(nums[i]) + 1);
            }
        }
        return min;
    }
}
