// Input:  [1,1,2,3,3,4,4,8,8]  -> Output: 2
// The single element breaks the even/odd pairing order.
// Binary search toward the disturbed half based on whether mid is even/odd.
class SingleElementInSortedArray {
    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if ((m & 1) == 1) m--; // make it even if it's odd
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
