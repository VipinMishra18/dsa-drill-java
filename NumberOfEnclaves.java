// Count land cells (1) that cannot reach the border. Sink border-connected land first.
class NumberOfEnclaves {
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    static int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) dfs(grid, i, 0, m, n);
            if (grid[i][n - 1] == 1) dfs(grid, i, n - 1, m, n);
        }
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) dfs(grid, 0, j, m, n);
            if (grid[m - 1][j] == 1) dfs(grid, m - 1, j, m, n);
        }

        int ans = 0;
        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                if (grid[r][c] == 1) ans++;
        return ans;
    }

    private static void dfs(int[][] grid, int r, int c, int m, int n) {
        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0) return;
        grid[r][c] = 0;
        for (int[] d : DIRS) dfs(grid, r + d[0], c + d[1], m, n);
    }
}
