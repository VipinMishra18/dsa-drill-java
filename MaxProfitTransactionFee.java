/* PROBLEM ------------------------------------------------------
 * Max Profit with Transaction Fee  |  Medium
 * Topics: DP
 * Max profit with unlimited transactions, paying a fee per transaction.
 * Example: [1,3,2,8,4,9], fee=2 → 8
 * LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */

import java.util.*;

// Unlimited transactions, pay `fee` per completed transaction (memoized).
// prices=[1,3,2,8,4,9], fee=2 -> 8
class MaxProfitTransactionFee {
    static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] cache = new int[n][2]; // [i][hold]
        for (int[] row : cache) Arrays.fill(row, Integer.MIN_VALUE);
        return dfs(0, 0, prices, fee, cache);
    }

    private static int dfs(int i, int hold, int[] prices, int fee, int[][] cache) {
        if (i >= prices.length) return 0;
        if (cache[i][hold] != Integer.MIN_VALUE) return cache[i][hold];

        int ans;
        if (hold == 0) {
            int buy = -prices[i] + dfs(i + 1, 1, prices, fee, cache);
            int skip = dfs(i + 1, 0, prices, fee, cache);
            ans = Math.max(buy, skip);
        } else {
            int sell = prices[i] - fee + dfs(i + 1, 0, prices, fee, cache);
            int skip = dfs(i + 1, 1, prices, fee, cache);
            ans = Math.max(sell, skip);
        }
        return cache[i][hold] = ans;
    }
}
