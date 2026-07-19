import java.util.*;

// Fall top->bottom, moving to the cell directly below or diagonally below.
class MinimumFallingPathSum {
    private static final int INF = 1_000_000_000;
    private static final int[][] DIRS = {{1, -1}, {1, 0}, {1, 1}};

    static int minimumFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] cache = new int[m][n];
        for (int[] row : cache) Arrays.fill(row, -1);

        int ans = INF;
        for (int c = 0; c < n; c++) ans = Math.min(ans, dfs(0, c, matrix, m, n, cache));
        return ans;
    }

    private static int dfs(int r, int c, int[][] matrix, int m, int n, int[][] cache) {
        if (r < 0 || c < 0 || r >= m || c >= n) return INF;
        if (r == m - 1) return matrix[r][c];
        if (cache[r][c] != -1) return cache[r][c];

        int ans = INF;
        for (int[] d : DIRS) {
            int next = dfs(r + d[0], c + d[1], matrix, m, n, cache);
            if (next != INF) ans = Math.min(ans, matrix[r][c] + next);
        }
        return cache[r][c] = ans;
    }
}
