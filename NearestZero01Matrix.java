import java.util.*;

// Distance of each cell to the nearest 0. Multi-source BFS from all zeros.
class NearestZero01Matrix {
    static int[][] nearestZero(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 0) q.add(new int[]{i, j});
                else mat[i][j] = -1; // mark unvisited

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0], c = cell[1];
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n || mat[nr][nc] != -1) continue;
                mat[nr][nc] = mat[r][c] + 1;
                q.add(new int[]{nr, nc});
            }
        }
        return mat;
    }
}
