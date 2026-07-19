class MergeSort {
    int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int l, int r) {
        if (l == r) return new int[]{nums[l]};
        int m = l + (r - l) / 2;
        int[] left = mergeSort(nums, l, m);
        int[] right = mergeSort(nums, m + 1, r);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, n = left.length, m = right.length, k = 0;
        int[] ans = new int[n + m];
        while (i < n && j < m) ans[k++] = left[i] < right[j] ? left[i++] : right[j++];
        while (i < n) ans[k++] = left[i++];
        while (j < m) ans[k++] = right[j++];
        return ans;
    }
}
