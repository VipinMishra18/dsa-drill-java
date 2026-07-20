/* PROBLEM ------------------------------------------------------
 * Capture Surrounded Regions  |  Medium
 * Topics: Graph, DFS
 * Flip every 'O' region not connected to the border into 'X'.
 * LeetCode: https://leetcode.com/problems/surrounded-regions/
 */

// Flip every 'O' region NOT connected to a border into 'X'.
class CaptureSurroundedRegions {
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static void capture(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        // Mark border-connected 'O's as safe.
        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                if (!(r > 0 && c > 0 && r < m - 1 && c < n - 1))
                    markBorder(board, r, c, m, n, visited);

        // Flip all unmarked 'O's.
        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                flip(board, r, c, m, n, visited);
    }

    private static void markBorder(char[][] b, int r, int c, int m, int n, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= m || c >= n || b[r][c] == 'X' || visited[r][c]) return;
        visited[r][c] = true;
        for (int[] d : DIRS) markBorder(b, r + d[0], c + d[1], m, n, visited);
    }

    private static void flip(char[][] b, int r, int c, int m, int n, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= m || c >= n || b[r][c] == 'X' || visited[r][c]) return;
        b[r][c] = 'X';
        for (int[] d : DIRS) flip(b, r + d[0], c + d[1], m, n, visited);
    }
}
