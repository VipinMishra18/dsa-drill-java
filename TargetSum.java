/* PROBLEM ------------------------------------------------------
 * Target Sum  |  Medium
 * Topics: DP
 * Number of ways to assign + / - to reach the target sum.
 * Example: [1,1,1,1,1], t=3 → 5
 * LeetCode: https://leetcode.com/problems/target-sum/
 */

import java.util.*;

// Assign +/- to each number so the signed sum equals target; count the ways.
class TargetSum {
    static int findTargetSumWays(int[] nums, int target) {
        return dfs(0, 0, nums, target, new HashMap<>());
    }

    private static int dfs(int i, int sum, int[] nums, int target, Map<String, Integer> cache) {
        if (i == nums.length) return sum == target ? 1 : 0;
        String key = i + "+" + sum;
        if (cache.containsKey(key)) return cache.get(key);
        int ans = dfs(i + 1, sum + nums[i], nums, target, cache)
                + dfs(i + 1, sum - nums[i], nums, target, cache);
        cache.put(key, ans);
        return ans;
    }
}
