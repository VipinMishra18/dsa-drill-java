/* PROBLEM ------------------------------------------------------
 * Single Appearence  |  Easy
 * Topics: Array
 * Every element appears twice except one; find it with XOR.
 * Example: [4,1,2,1,2] → 4
 * LeetCode: https://leetcode.com/problems/single-number/
 */

// Every element appears twice except one; XOR cancels the pairs.
class SingleAppearance {
    static int findNumberWhichAppearsOnce(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }
}
