class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int max = 0, localMax = 0, minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            localMax = prices[i] - minPrice;
            if (max < localMax) {
                max = localMax;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return max;
    }
}