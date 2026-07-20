/* PROBLEM ------------------------------------------------------
 * Set zeros in matrix  |  Medium
 * Topics: Array
 * If a cell is 0, set its entire row and column to 0.
 * Example: [[1,1,1],[1,0,1],[1,1,1]] → [[1,0,1],[0,0,0],[1,0,1]]
 * LeetCode: https://leetcode.com/problems/set-matrix-zeroes/
 */

import java.util.*;

class SetZerosInMatrix {
    static void setZerosInMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] rows = new int[m], cols = new int[n];
        Arrays.fill(rows, 1);
        Arrays.fill(cols, 1);
        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                if (matrix[r][c] == 0) { rows[r] = 0; cols[c] = 0; }

        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                if (rows[r] * cols[c] == 0) matrix[r][c] = 0;
    }
}
