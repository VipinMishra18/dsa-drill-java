/* PROBLEM ------------------------------------------------------
 * Coin Change  |  Medium
 * Topics: DP
 * Fewest coins to make the amount (-1 if impossible); infinite supply.
 * Example: [1,2,5], 11 → 3
 * LeetCode: https://leetcode.com/problems/coin-change/
 */

import java.util.*;

// Fewest coins to make `amount` (infinite supply); -1 if impossible.
class CoinChange {
    private static final int INF = 1_000_000_000;

    static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] cache = new int[n + 1][amount + 1];
        for (int[] row : cache) Arrays.fill(row, -1);
        int ans = dfs(0, amount, coins, cache);
        return ans >= INF ? -1 : ans;
    }

    private static int dfs(int i, int target, int[] coins, int[][] cache) {
        if (target == 0) return 0;
        if (i >= coins.length || target < 0) return INF;
        if (cache[i][target] != -1) return cache[i][target];

        int pick = 1 + dfs(i, target - coins[i], coins, cache);
        int dontPick = dfs(i + 1, target, coins, cache);
        return cache[i][target] = Math.min(pick, dontPick);
    }
}
