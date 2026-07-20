/* PROBLEM ------------------------------------------------------
 * Equal Partition Subset Sum  |  Medium
 * Topics: DP, Knapsack
 * Can the array be split into two subsets with equal sum?
 * Example: [1,5,11,5] → true
 * LeetCode: https://leetcode.com/problems/partition-equal-subset-sum/
 */

import java.util.*;

// Can the array split into two subsets of equal sum? (= subset summing to total/2)
// NOTE: rewritten as a clean subset-sum DP; the original's cache indexing was buggy.
class EqualPartitionSubsetSum {
    static boolean canPartition(int[] input) {
        int total = 0;
        for (int x : input) total += x;
        if ((total & 1) == 1) return false;

        int target = total / 2, n = input.length;
        int[][] cache = new int[n][target + 1];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, target, input, cache);
    }

    private static boolean dfs(int i, int rem, int[] nums, int[][] cache) {
        if (rem == 0) return true;
        if (i >= nums.length || rem < 0) return false;
        if (cache[i][rem] != -1) return cache[i][rem] == 1;

        boolean ans = dfs(i + 1, rem - nums[i], nums, cache) || dfs(i + 1, rem, nums, cache);
        cache[i][rem] = ans ? 1 : 0;
        return ans;
    }
}
