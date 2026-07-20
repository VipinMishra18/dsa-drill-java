/* PROBLEM ------------------------------------------------------
 * Majority element  |  Easy
 * Topics: Array
 * Element appearing more than n/2 times (Boyer-Moore voting).
 * Example: [2,2,1,1,1,2,2] → 2
 * LeetCode: https://leetcode.com/problems/majority-element/
 */

// Boyer-Moore voting (element appearing > n/2 times).
class MajorityElement {
    static int majorityElement(int[] nums) {
        int votes = 0, ans = 0;
        for (int num : nums) {
            if (votes == 0) ans = num;
            if (ans == num) votes++;
            else votes--;
        }
        return ans;
    }
}
