// One buy + one sell. Kadane on daily deltas.
class MaxProfitSingleTransaction {
    static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0, ans = 0;
        for (int i = 1; i < n; i++) {
            profit += prices[i] - prices[i - 1];
            if (profit < 0) profit = 0;
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}
