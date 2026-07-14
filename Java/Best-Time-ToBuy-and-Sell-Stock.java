class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_prof = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            int prof = prices[i] - min_price;
            if (prof > max_prof) {
                max_prof = prof;
            }
        }
        return max_prof;
    }
}
