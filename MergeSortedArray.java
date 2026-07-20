/* PROBLEM ------------------------------------------------------
 * Merge sorted array  |  Easy
 * Topics: Array
 * Merge nums2 into nums1 (which has trailing space) so nums1 stays sorted.
 * Example: [1,2,3,0,0,0],[2,5,6] → [1,2,2,3,5,6]
 * LeetCode: https://leetcode.com/problems/merge-sorted-array/
 */

// nums1 has m valid values then n empty slots; nums2 has n values. Merge in place from the back.
class MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j > -1) {
            if (i > -1 && nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
    }
}
