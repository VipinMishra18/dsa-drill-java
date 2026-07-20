/* PROBLEM ------------------------------------------------------
 * Count subarray of K sum  |  Medium
 * Topics: Array, Hash Map, Prefix Sum
 * Count contiguous subarrays whose sum equals k.
 * Example: [1,1,1], k=2 → 2
 * LeetCode: https://leetcode.com/problems/subarray-sum-equals-k/
 */

import java.util.*;

class CountSubarrayOfKSum {
    // HASHMAP: track frequency of prefix sums; count complements (sum - k).
    static int hashMap(int[] nums, int k) {
        int n = nums.length, sum = 0, ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (mp.containsKey(sum - k)) ans += mp.get(sum - k);
            mp.merge(sum, 1, Integer::sum);
        }
        return ans;
    }

    // PREFIX SUM: brute-force O(n^2) over prefix-sum differences.
    static int prefixSum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i < n + 1; i++) pre[i] = pre[i - 1] + nums[i - 1];
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n + 1; j++)
                if (pre[j] - pre[i] == k) ans++;
        return ans;
    }
}
