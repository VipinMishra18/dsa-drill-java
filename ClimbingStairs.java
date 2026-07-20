/* PROBLEM ------------------------------------------------------
 * Climbing Stairs  |  Easy
 * Topics: DP, DFS
 * Number of ways to climb n stairs taking 1 or 2 steps.
 * Example: n=3 → 3
 * LeetCode: https://leetcode.com/problems/climbing-stairs/
 */

import java.util.*;

// Ways to reach step n taking 1 or 2 steps at a time (top-down DP).
class ClimbingStairs {
    static int climbStairs(int n) {
        int[] cache = new int[Math.max(n, 1)];
        Arrays.fill(cache, -1);
        return dfs(0, n, cache);
    }

    private static int dfs(int i, int n, int[] cache) {
        if (i >= n) return i == n ? 1 : 0;
        if (cache[i] != -1) return cache[i];
        int ans = dfs(i + 1, n, cache) + dfs(i + 2, n, cache);
        return cache[i] = ans;
    }
}
