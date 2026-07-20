/* PROBLEM ------------------------------------------------------
 * Longest subarray of K sum  |  Medium
 * Topics: Array, Hash Map, Sliding Window
 * Length of the longest contiguous subarray summing to k (hash-map +
 * sliding-window).
 * Example: [1,2,3,1,1,1], k=3 → 3
 */

import java.util.*;

class LongestSubarrayOfKSum {
    // HASHMAP => works for any integers (handles negatives).
    static int hashMap(int[] nums, int k) {
        int n = nums.length, sum = 0, ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (mp.containsKey(sum - k)) ans = Math.max(ans, i - mp.get(sum - k));
            if (!mp.containsKey(sum)) mp.put(sum, i); // first occurrence of this prefix sum
        }
        return ans;
    }

    // SLIDING WINDOW => positive numbers only.
    static int slidingWindow(int[] nums, int k) {
        int n = nums.length, sum = 0, ans = 0;
        for (int i = 0, j = 0; j < n; j++) {
            sum += nums[j];
            while (i <= j && sum > k) sum -= nums[i++];
            if (sum == k) ans = Math.max(ans, j - i + 1); // drop this check for "at least k"
        }
        return ans;
    }
}
