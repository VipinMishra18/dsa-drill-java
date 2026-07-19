// In-place next lexicographic permutation.
class NextPermutation {
    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        // find the first index from the right where nums[i] < nums[i+1]
        // (>= skips equal elements, so this is correct for duplicates)
        while (i > -1 && nums[i] >= nums[i + 1]) i--;
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int idx = UpperBoundReverse.upperBoundDecOrder(nums, i + 1, n - 1, nums[i]);
        swap(nums, i, idx);
        reverse(nums, i + 1, n - 1);
    }

    private static void reverse(int[] a, int l, int r) { while (l < r) swap(a, l++, r--); }
    private static void swap(int[] a, int x, int y) { int t = a[x]; a[x] = a[y]; a[y] = t; }
}
