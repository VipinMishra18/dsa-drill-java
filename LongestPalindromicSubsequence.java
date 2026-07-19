import java.util.*;

// s="bbbab" -> 4 ("bbbb")
class LongestPalindromicSubsequence {
    static int longestPalindromeSubsequence(String s) {
        int n = s.length();
        int[][] cache = new int[n][n];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, n - 1, s, cache);
    }

    private static int dfs(int i, int j, String s, int[][] cache) {
        if (j < i) return 0;
        if (j == i) return 1;
        if (cache[i][j] != -1) return cache[i][j];

        int ans;
        if (s.charAt(i) == s.charAt(j)) {
            ans = 2 + dfs(i + 1, j - 1, s, cache);
        } else {
            ans = Math.max(dfs(i + 1, j, s, cache), dfs(i, j - 1, s, cache));
        }
        return cache[i][j] = ans;
    }
}
