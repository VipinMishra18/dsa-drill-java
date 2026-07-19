// Index of the smallest element (rotation point) in a rotated sorted array.
class Pivot {
    static int pivot(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;

        // Only needed if duplicates present (TC: O(n))
        while (l < n - 1 && nums[l] == nums[l + 1]) l++;
        while (r > 0 && nums[r - 1] == nums[r]) r--;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
