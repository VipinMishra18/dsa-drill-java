// If val exists -> first occurrence index.
// Else -> index of next greater element; if none greater -> nums.length (end).
class LowerBound {
    static int lowerBound(int[] nums, int val) {
        int n = nums.length;
        int l = 0, r = n - 1, ans = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= val) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
