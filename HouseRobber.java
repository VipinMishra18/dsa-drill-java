/* PROBLEM ------------------------------------------------------
 * House Robber  |  Medium
 * Topics: DP, DFS
 * Max sum of non-adjacent elements (can't rob two neighbors).
 * Example: [2,7,9,3,1] → 12
 * LeetCode: https://leetcode.com/problems/house-robber/
 */

import java.util.*;

// Max sum of non-adjacent houses (top-down DP).
class HouseRobber {
    static int houseRobber(int[] nums) {
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);
        return dfs(0, nums, cache);
    }

    private static int dfs(int i, int[] nums, int[] cache) {
        if (i >= nums.length) return 0;
        if (cache[i] != -1) return cache[i];
        int take = nums[i] + dfs(i + 2, nums, cache);
        int dontTake = dfs(i + 1, nums, cache);
        return cache[i] = Math.max(take, dontTake);
    }
}
