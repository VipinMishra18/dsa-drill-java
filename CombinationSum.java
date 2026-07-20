/* PROBLEM ------------------------------------------------------
 * Combination Sum I/II  |  Medium
 * Topics: DP, Knapsack, Backtracking
 * All combinations summing to target; each number may be reused.
 * Example: [2,3,6,7], t=7 → [[2,2,3],[7]]
 * LeetCode: https://leetcode.com/problems/combination-sum/
 */

import java.util.*;

// Unbounded = reuse each element; Bounded = use once (swap the marked recursive call).
class CombinationSum {
    static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, 0, new ArrayList<>(), nums, target, ans);
        return ans;
    }

    private static void dfs(int i, int sum, List<Integer> temp, int[] nums, int target, List<List<Integer>> ans) {
        if (sum > target) return; // prune (needed so the unbounded branch terminates)
        if (i >= nums.length) {
            if (sum == target) ans.add(new ArrayList<>(temp));
            return;
        }

        sum += nums[i];
        temp.add(nums[i]);
        dfs(i, sum, temp, nums, target, ans);        // unbounded knapsack
        // dfs(i + 1, sum, temp, nums, target, ans); // bounded knapsack
        temp.remove(temp.size() - 1);
        sum -= nums[i];

        dfs(i + 1, sum, temp, nums, target, ans);
    }
}
