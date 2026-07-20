/* PROBLEM ------------------------------------------------------
 * Assign Cookies  |  Easy
 * Topics: Greedy
 * Max children satisfied when child greed g[i] needs cookie size ≥ g[i].
 * Example: g=[1,2,3], s=[1,1] → 1
 * LeetCode: https://leetcode.com/problems/assign-cookies/
 */

import java.util.*;

// Greedy: satisfy the greediest children with the largest cookies first.
class AssignCookies {
    static int assignCookies(int[] g, int[] s) {
        int ans = 0, n = g.length, m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = n - 1, j = m - 1; i > -1 && j > -1; i--) {
            if (s[j] >= g[i]) {
                ans++;
                j--;
            }
        }
        return ans;
    }
}
