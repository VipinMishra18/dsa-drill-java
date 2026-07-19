// In a DESCENDING-sorted range [l, r], return the index of the last element
// strictly greater than val. Used by Next Permutation on the descending suffix.
class UpperBoundReverse {
    static int upperBoundDecOrder(int[] nums, int l, int r, int val) {
        int ans = r + 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > val) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}
