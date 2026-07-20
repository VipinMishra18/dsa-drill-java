/* PROBLEM ------------------------------------------------------
 * N-Queens (count)  |  Hard
 * Topics: Backtracking
 * Count distinct ways to place N non-attacking queens.
 * Example: n=4 → 2
 * LeetCode: https://leetcode.com/problems/n-queens-ii/
 */

// Count distinct N-Queens placements. Track used columns and both diagonals.
class NQueens {
    static int totalNQueens(int n) {
        return dfs(0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
    }

    private static int dfs(int r, int n, boolean[] cols, boolean[] diag, boolean[] anti) {
        if (r == n) return 1;
        int count = 0;
        for (int c = 0; c < n; c++) {
            int d = r + c, a = r - c + n;
            if (cols[c] || diag[d] || anti[a]) continue;
            cols[c] = diag[d] = anti[a] = true;
            count += dfs(r + 1, n, cols, diag, anti);
            cols[c] = diag[d] = anti[a] = false;
        }
        return count;
    }
}
