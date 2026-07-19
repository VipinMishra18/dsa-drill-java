import java.util.*;

// Unlimited transactions with a 1-day cooldown after selling (memoized).
// prices=[1,2,3,0,2] -> 3  ([buy, sell, cooldown, buy, sell])
class MaxProfitCooldown {
    static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] cache = new int[n][2]; // [i][hold]
        for (int[] row : cache) Arrays.fill(row, Integer.MIN_VALUE);
        return dfs(0, 0, prices, cache);
    }

    private static int dfs(int i, int hold, int[] prices, int[][] cache) {
        if (i >= prices.length) return 0;
        if (cache[i][hold] != Integer.MIN_VALUE) return cache[i][hold];

        int ans;
        if (hold == 0) {
            int buy = -prices[i] + dfs(i + 1, 1, prices, cache);
            int skip = dfs(i + 1, 0, prices, cache);
            ans = Math.max(buy, skip);
        } else {
            int sell = prices[i] + dfs(i + 2, 0, prices, cache); // skip a day (cooldown)
            int skip = dfs(i + 1, 1, prices, cache);
            ans = Math.max(sell, skip);
        }
        return cache[i][hold] = ans;
    }
}
