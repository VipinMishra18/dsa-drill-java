/* PROBLEM ------------------------------------------------------
 * Max Profit Multiple Transactions  |  Medium
 * Topics: DP
 * Max profit with unlimited buy/sell transactions.
 * Example: [7,1,5,3,6,4] → 7
 * LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

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
