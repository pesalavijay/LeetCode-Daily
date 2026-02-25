class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minAmount = prices[0];
        for(int i=0; i<prices.length; i++){
            minAmount = Math.min(minAmount, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minAmount);
        }
        return maxProfit;
    }
}
