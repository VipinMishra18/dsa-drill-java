/* PROBLEM ------------------------------------------------------
 * Sort Array 012  |  Medium
 * Topics: Array
 * Sort an array of 0s, 1s, 2s in one pass (Dutch national flag).
 * Example: [2,0,2,1,1,0] → [0,0,1,1,2,2]
 * LeetCode: https://leetcode.com/problems/sort-colors/
 */

// Dutch National Flag: partition 0s, 1s, 2s in one pass.
class SortArray012 {
    static void sortArrZeroOneTwo(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, k = n - 1;
        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, i, j); i++; j++;
            } else if (nums[j] == 1) {
                j++;
            } else {
                swap(nums, j, k); k--;
            }
        }
    }

    private static void swap(int[] a, int x, int y) { int t = a[x]; a[x] = a[y]; a[y] = t; }
}
