/* PROBLEM ------------------------------------------------------
 * Maximum consecutive ones  |  Easy
 * Topics: Array
 * Length of the longest run of consecutive 1s.
 * Example: [1,1,0,1,1,1] → 3
 * LeetCode: https://leetcode.com/problems/max-consecutive-ones/
 */

class MaximumConsecutiveOnes {
    static int maximumConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0;
        for (int num : nums) {
            if (num == 1) count++;
            else count = 0;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
