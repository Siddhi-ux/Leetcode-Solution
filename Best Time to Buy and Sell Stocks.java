class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minP= Math.min(minP,prices[i]);
            maxP = Math.max(maxP, prices[i]-minP);
        }
        return maxP;
    }
}
