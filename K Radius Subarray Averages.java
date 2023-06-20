lass Solution {
    public int[] getAverages(int[] nums, int k) {
        /*
        
        nums =      [7,4,3,9,1,8,5,2,6], k = 3

        prefixSum = [7,11,14,23,15,32,37,39,45]
        postfixSum = [45,38,34,31,22,21,13,8,6]

        result = [-1,-1,-1,]

        i = 3, value = 9
        prefix element = 23, prefix element - i - 1 -> out of bound
        postfix element = 31, postfix element + i + 1

        */

        int n = nums.length;
        
        long[] prefixes = new long[n];
        prefixes[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixes[i] = prefixes[i - 1] + nums[i];
        }

        int[] result = new int[n];
        Arrays.fill(result, -1);
        for (int i = k; i < (n - k); i++) {
            int leftIdx = i - k;
            int rightIdx = i + k;
            long prefixLeftSum = (leftIdx - 1 < 0) ? 0 : prefixes[leftIdx - 1];
            long prefixRightSum = prefixes[rightIdx];

            result[i] = (int) ((prefixRightSum - prefixLeftSum) / (k * 2 + 1));
        }
