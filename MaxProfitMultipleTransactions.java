// Unlimited transactions: grab every positive delta.
class MaxProfitMultipleTransactions {
    static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit >= 0) ans += profit;
        }
        return ans;
    }
}
