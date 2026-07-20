/* PROBLEM ------------------------------------------------------
 * Spiral matrix  |  Medium
 * Topics: Array
 * Return all matrix elements in spiral order.
 * Example: [[1,2,3],[4,5,6],[7,8,9]] → [1,2,3,6,9,8,7,4,5]
 * LeetCode: https://leetcode.com/problems/spiral-matrix/
 */

import java.util.*;

class SpiralMatrix {
    static List<Integer> spiralMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[m][n];

        int r = 0, c = 0, d = 0;
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dirs[d][0];
            int nc = c + dirs[d][1];
            if (nr < 0 || nc < 0 || nr >= m || nc >= n || visited[nr][nc]) {
                d = (d + 1) % 4;
                nr = r + dirs[d][0];
                nc = c + dirs[d][1];
            }
            r = nr;
            c = nc;
        }
        return ans;
    }
}
