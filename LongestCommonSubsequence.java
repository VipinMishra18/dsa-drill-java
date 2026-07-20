/* PROBLEM ------------------------------------------------------
 * Longest Common Subsequence  |  Medium
 * Topics: DP, String
 * Length of the longest common subsequence of two strings.
 * Example: "abcde","ace" → 3
 * LeetCode: https://leetcode.com/problems/longest-common-subsequence/
 */

import java.util.*;

// text1="abcde", text2="ace" -> 3 ("ace")
class LongestCommonSubsequence {
    static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] cache = new int[m][n];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, 0, s1, s2, cache);
    }

    private static int dfs(int i, int j, String s1, String s2, int[][] cache) {
        if (i >= s1.length() || j >= s2.length()) return 0;
        if (cache[i][j] != -1) return cache[i][j];

        int ans;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + dfs(i + 1, j + 1, s1, s2, cache);
        } else {
            ans = Math.max(dfs(i + 1, j, s1, s2, cache), dfs(i, j + 1, s1, s2, cache));
        }
        return cache[i][j] = ans;
    }
}
