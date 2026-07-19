// Count connected groups of '1' in a char grid; sink each island via DFS.
class NumberOfIslands {
    private static final int[][] DIRS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static int numberOfIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                ans += dfs(grid, i, j, m, n);
        return ans;
    }

    private static int dfs(char[][] grid, int r, int c, int m, int n) {
        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == '0') return 0;
        grid[r][c] = '0';
        for (int[] d : DIRS) dfs(grid, r + d[0], c + d[1], m, n);
        return 1;
    }
}
