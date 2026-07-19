import java.util.*;

// Minimize the maximum absolute height difference along a path (Dijkstra-style).
class MinimumEffortPath {
    static int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int[][] ans = new int[m][n];
        for (int[] row : ans) Arrays.fill(row, Integer.MAX_VALUE);
        ans[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // {effort, r, c}
        pq.add(new int[]{0, 0, 0});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0], r = top[1], c = top[2];
            if (r == m - 1 && c == n - 1) return d;

            for (int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n) continue;
                int diff = Math.max(ans[r][c], Math.abs(heights[nr][nc] - heights[r][c]));
                if (diff < ans[nr][nc]) {
                    ans[nr][nc] = diff;
                    pq.add(new int[]{diff, nr, nc});
                }
            }
        }
        return -1;
    }
}
