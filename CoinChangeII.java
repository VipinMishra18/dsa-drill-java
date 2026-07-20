/* PROBLEM ------------------------------------------------------
 * Coin Change II  |  Medium
 * Topics: DP
 * Number of distinct combinations that make the amount.
 * Example: [1,2,5], 5 → 4
 * LeetCode: https://leetcode.com/problems/coin-change-ii/
 */

import java.util.*;

// Number of combinations that make `amount` (infinite supply).
class CoinChangeII {
    static int coinChangeII(int amount, int[] coins) {
        int n = coins.length;
        int[][] cache = new int[n + 1][amount + 1];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, amount, coins, cache);
    }

    private static int dfs(int i, int target, int[] coins, int[][] cache) {
        if (target == 0) return 1;
        if (i >= coins.length || target < 0) return 0;
        if (cache[i][target] != -1) return cache[i][target];

        int pick = dfs(i, target - coins[i], coins, cache);
        int dontPick = dfs(i + 1, target, coins, cache);
        return cache[i][target] = pick + dontPick;
    }
}
