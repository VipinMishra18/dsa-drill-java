/* PROBLEM ------------------------------------------------------
 * Missing number  |  Easy
 * Topics: Array
 * Find the one number missing from the range [0..n].
 * Example: [3,0,1] → 2
 * LeetCode: https://leetcode.com/problems/missing-number/
 */

// Sum 0..n minus actual sum = the missing value.
class MissingNumber {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int tSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return tSum - sum;
    }
}
