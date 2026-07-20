/* PROBLEM ------------------------------------------------------
 * Subarray Minimum  |  Medium
 * Topics: Array, DP
 * Minimum-sum contiguous subarray (Kadane, minimizing variant).
 * Example: [2,-1,-3,4] → -4
 */

// Minimum subarray sum (Kadane, min variant).
class SubarrayMinimum {
    static int subarrayMinimum(int[] nums) {
        int ans = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (num < sum) sum = num;
            ans = Math.min(ans, sum);
        }
        return ans;
    }
}
