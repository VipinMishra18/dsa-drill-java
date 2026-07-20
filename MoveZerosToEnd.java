/* PROBLEM ------------------------------------------------------
 * Move zeros to end  |  Easy
 * Topics: Array
 * Move all zeros to the end, preserving the order of non-zeros.
 * Example: [0,1,0,3,12] → [1,3,12,0,0]
 * LeetCode: https://leetcode.com/problems/move-zeroes/
 */

// Two pointers: swap non-zeros to the front, zeros drift to the end.
class MoveZerosToEnd {
    static void moveZerosToEnd(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) continue;
            int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
            i++;
        }
    }
}
