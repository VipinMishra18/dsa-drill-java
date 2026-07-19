import java.util.*;

// nums=[10,9,2,5,3,7,101,18] -> 4 ([2,3,7,101])
class LongestIncreasingSubsequence {
    // Recursive: (prev index, current index) with memo.
    static int recursive(int[] nums) {
        return dfs(-1, 0, nums, new HashMap<>());
    }

    private static int dfs(int i, int j, int[] nums, Map<Long, Integer> cache) {
        if (j == nums.length) return 0;
        long key = ((long) (i + 1) << 32) | j; // +1 so prev index -1 encodes cleanly
        if (cache.containsKey(key)) return cache.get(key);

        int ans = dfs(i, j + 1, nums, cache);
        if (i == -1 || nums[i] < nums[j]) ans = Math.max(ans, 1 + dfs(j, j + 1, nums, cache));
        cache.put(key, ans);
        return ans;
    }

    // Iterative O(n^2) DP (fastest of the two here).
    static int iterative(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = n - 2; i >= 0; i--)
            for (int j = i + 1; j < n; j++)
                if (nums[i] < nums[j]) dp[i] = Math.max(dp[i], 1 + dp[j]);

        int ans = 0;
        for (int x : dp) ans = Math.max(ans, x);
        return ans;
    }
}
