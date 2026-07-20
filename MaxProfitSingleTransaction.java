/* PROBLEM ------------------------------------------------------
 * Max Profit Single Transaction  |  Easy
 * Topics: DP
 * Max profit from a single buy then sell.
 * Example: [7,1,5,3,6,4] → 5
 * LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

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
