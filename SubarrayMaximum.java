/* PROBLEM ------------------------------------------------------
 * Subarray Maximum  |  Medium
 * Topics: Array, DP
 * Maximum-sum contiguous subarray (Kadane).
 * Example: [-2,1,-3,4,-1,2,1,-5,4] → 6
 * LeetCode: https://leetcode.com/problems/maximum-subarray/
 */

// Maximum subarray sum (Kadane).
class SubarrayMaximum {
    static int subarrayMaximum(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (num > sum) sum = num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
