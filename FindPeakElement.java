/* PROBLEM ------------------------------------------------------
 * Find Peak Element  |  Medium
 * Topics: Binary search
 * Return the index of any peak (element greater than both neighbors).
 * Example: [1,2,3,1] → 2
 * LeetCode: https://leetcode.com/problems/find-peak-element/
 */

// https://leetcode.com/problems/find-peak-element/
// A peak is strictly greater than its neighbors. nums[-1] = nums[n] = -inf.
// nums[i] != nums[i + 1] for all valid i. Return any peak index.
class FindPeakElement {
    static int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
