import java.util.*;

// BFS shortest path (edge count) in an unweighted graph.
class ShortestPathUnweighted {
    static int shortestPath(List<List<Integer>> graph, int src, int dest) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new ArrayDeque<>();

        dist[src] = 0;
        q.add(src);
        while (!q.isEmpty()) {
            int u = q.poll();
            if (u == dest) return dist[dest];
            for (int v : graph.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }
        return -1;
    }
}
