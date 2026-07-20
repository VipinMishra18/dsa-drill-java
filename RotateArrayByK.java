/* PROBLEM ------------------------------------------------------
 * Rotate array by K  |  Medium
 * Topics: Array
 * Rotate the array by k positions (reverse-based and iterative; this impl
 * rotates left).
 * Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
 * LeetCode: https://leetcode.com/problems/rotate-array/
 */

// Left rotation by k, two ways.
class RotateArrayByK {
    // Reverse-based, O(1) extra space.
    static void reverseRotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
        // for right rotation, reverse the order of the 3 steps
    }

    // Iterative with an auxiliary array.
    static void iterativeRotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i]; // push element at i to (i + k) % n
        }
        System.arraycopy(ans, 0, nums, 0, n);
    }

    private static void reverse(int[] a, int l, int r) {
        while (l < r) { int t = a[l]; a[l] = a[r]; a[r] = t; l++; r--; }
    }
}
