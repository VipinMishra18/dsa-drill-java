/* PROBLEM ------------------------------------------------------
 * Majority element II  |  Medium
 * Topics: Array
 * All elements appearing more than n/3 times.
 * Example: [3,2,3] → [3]
 * LeetCode: https://leetcode.com/problems/majority-element-ii/
 */

import java.util.*;

// Boyer-Moore for elements appearing > n/3 times (at most two candidates).
class MajorityElementII {
    static List<Integer> majorityElementII(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int ans1 = Integer.MIN_VALUE, ans2 = Integer.MIN_VALUE, votes1 = 0, votes2 = 0;
        for (int num : nums) {
            if (ans1 == num) votes1++;
            else if (ans2 == num) votes2++;
            else if (votes1 == 0) { ans1 = num; votes1 = 1; }
            else if (votes2 == 0) { ans2 = num; votes2 = 1; }
            else { votes1--; votes2--; }
        }

        int c1 = 0, c2 = 0;
        for (int num : nums) {
            if (num == ans1) c1++;
            else if (num == ans2) c2++;
        }
        if (c1 > n / 3) ans.add(ans1);
        if (c2 > n / 3) ans.add(ans2); // (original had a typo adding ans1 twice)
        return ans;
    }
}
