// Search a value in a rotated sorted array.
// Plan (from the original stub):
//   find pivot idx
//   search(0, pivot - 1)
//   search(pivot, n - 1)
class RotatedSearch {
    static int rotatedSearch(int[] nums, int val) {
        int n = nums.length;
        int p = pivot(nums);
        int idx = binarySearch(nums, 0, p - 1, val);
        if (idx != -1) return idx;
        return binarySearch(nums, p, n - 1, val);
    }

    private static int pivot(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) l = m + 1;
            else r = m;
        }
        return l;
    }

    private static int binarySearch(int[] nums, int l, int r, int val) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == val) return m;
            if (nums[m] < val) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
