class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        

        for (int num : countMap.keySet()) {
            if (countMap.get(num) > n / 3) {
                result.add(num);
            }
        }
        
        return result;
    }
}
