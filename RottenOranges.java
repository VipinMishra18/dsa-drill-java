import java.util.*;

// 0 empty, 1 fresh, 2 rotten. Multi-source BFS; return minutes until none fresh, else -1.
class RottenOranges {
    static int rottenOranges(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 2) q.add(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;

        int ans = 0;
        while (!q.isEmpty()) {
            if (fresh == 0) break;
            int size = q.size();
            while (size-- > 0) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];
                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr < 0 || nc < 0 || nr >= m || nc >= n || grid[nr][nc] == 2 || grid[nr][nc] == 0) continue;
                    grid[nr][nc] = 2;
                    fresh--;
                    q.add(new int[]{nr, nc});
                }
            }
            ans++;
        }
        return fresh == 0 ? ans : -1;
    }
}
