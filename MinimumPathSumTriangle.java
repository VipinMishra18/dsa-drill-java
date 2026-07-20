/* PROBLEM ------------------------------------------------------
 * Minimum Path Sum in Triangle  |  Medium
 * Topics: DP, Triangle
 * Minimum path sum from top to bottom of a triangle.
 * Example: [[2],[3,4],[6,5,7],[4,1,8,3]] → 11
 * LeetCode: https://leetcode.com/problems/triangle/
 */

import java.util.*;

class MinimumPathSumTriangle {
    static int minimumPathSumTriangle(int[][] triangle) {
        int m = triangle.length;
        int[][] cache = new int[m][m];
        for (int[] row : cache) Arrays.fill(row, -1);
        return dfs(0, 0, triangle, m, cache);
    }

    private static int dfs(int r, int c, int[][] triangle, int m, int[][] cache) {
        if (r >= m) return Integer.MAX_VALUE;
        if (r == m - 1) return triangle[r][c];
        if (cache[r][c] != -1) return cache[r][c];
        return cache[r][c] = triangle[r][c]
            + Math.min(dfs(r + 1, c, triangle, m, cache), dfs(r + 1, c + 1, triangle, m, cache));
    }
}
