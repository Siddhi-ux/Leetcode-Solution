class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        int[] dp = new int[n + 1]; // dp[i] represents the minimum extra characters for s[0:i]

        // Initialize dp array to a large value
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (String word : dictionary) {
                int len = word.length();
                if (i >= len && s.substring(i - len, i).equals(word)) {
                    dp[i] = Math.min(dp[i], dp[i - len]);
                }
            }
            dp[i] = Math.min(dp[i], dp[i - 1] + 1); // Consider not breaking the current character
        }

        return dp[n];
    }
}
