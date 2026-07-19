import java.util.*;

// Min insert/delete/replace ops to turn s1 into s2.
class EditDistance {
    static int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] cache = new int[m + 1][n + 1];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, 0, s1, s2, cache);
    }

    private static int dfs(int i, int j, String s1, String s2, int[][] cache) {
        int m = s1.length(), n = s2.length();
        if (i >= m) return n - j;
        if (j >= n) return m - i;
        if (cache[i][j] != -1) return cache[i][j];

        int ans;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = dfs(i + 1, j + 1, s1, s2, cache);
        } else {
            int ins = 1 + dfs(i, j + 1, s1, s2, cache);
            int del = 1 + dfs(i + 1, j, s1, s2, cache);
            int rep = 1 + dfs(i + 1, j + 1, s1, s2, cache);
            ans = Math.min(ins, Math.min(del, rep));
        }
        return cache[i][j] = ans;
    }
}
