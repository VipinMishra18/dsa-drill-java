import java.util.*;

// Shortest clear path (8-directional) from top-left to bottom-right in a 0/1 grid.
class ShortestPathBinaryMatrix {
    static int shortestPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        int ans = -1;
        if (grid[0][0] != 0) return ans;

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0], c = cell[1];
            if (r == m - 1 && c == n - 1) {
                ans = grid[r][c] + 1;
                break;
            }
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] != 0) continue;
                grid[nr][nc] = grid[r][c] + 1; // store distance-so-far, doubles as visited
                q.add(new int[]{nr, nc});
            }
        }
        return ans;
    }
}
