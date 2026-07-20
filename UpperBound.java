/* PROBLEM ------------------------------------------------------
 * Upper Bound  |  Core
 * Topics: Binary search
 * Index of the first element strictly greater than val (else n).
 * Example: [1,2,2,3], val=2 → 3
 */

// Return index of first element strictly greater than val.
// If all values are <= val, returns nums.length (end).
class UpperBound {
    static int upperBound(int[] nums, int val) {
        int n = nums.length;
        int l = 0, r = n - 1, ans = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > val) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
