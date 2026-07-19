import java.util.*;

// Paths from top-left to bottom-right moving only down/right.
class UniquePaths {
    static int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, 0, m, n, cache);
    }

    private static int dfs(int r, int c, int m, int n, int[][] cache) {
        if (r < 0 || c < 0 || r >= m || c >= n) return 0;
        if (r == m - 1 && c == n - 1) return 1;
        if (cache[r][c] != -1) return cache[r][c];
        int ans = dfs(r + 1, c, m, n, cache) + dfs(r, c + 1, m, n, cache);
        return cache[r][c] = ans;
    }
}
