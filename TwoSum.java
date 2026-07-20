/* PROBLEM ------------------------------------------------------
 * Two Sum  |  Easy
 * Topics: Array, Hash Map
 * Return indices of the two numbers that add up to target.
 * Example: [2,7,11,15], t=9 → [0,1]
 * LeetCode: https://leetcode.com/problems/two-sum/
 */

import java.util.*;

class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (mp.containsKey(need)) return new int[]{mp.get(need), i};
            mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
