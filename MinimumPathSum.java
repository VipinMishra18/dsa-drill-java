import java.util.*;

class MinimumPathSum {
    private static final int INF = 1_000_000_000;

    static int minimumPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] cache = new int[m][n];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, 0, grid, m, n, cache);
    }

    private static int dfs(int r, int c, int[][] grid, int m, int n, int[][] cache) {
        if (r == m || c == n) return INF;
        if (r == m - 1 && c == n - 1) return grid[r][c];
        if (cache[r][c] != -1) return cache[r][c];
        int minimum = Math.min(dfs(r, c + 1, grid, m, n, cache), dfs(r + 1, c, grid, m, n, cache));
        return cache[r][c] = grid[r][c] + minimum;
    }
}
