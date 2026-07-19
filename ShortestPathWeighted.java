import java.util.*;

// Dijkstra. graph.get(u) holds edges {v, w}.
// Min-heap by distance; skip stale entries (d > dist[u]).
class ShortestPathWeighted {
    static int shortestPath(List<List<int[]>> graph, int src, int dest) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // {dist, node}
        dist[src] = 0;
        pq.add(new int[]{0, src});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0], u = top[1];
            if (d > dist[u]) continue;
            if (u == dest) return d;
            for (int[] edge : graph.get(u)) {
                int v = edge[0], w = edge[1];
                int nd = d + w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.add(new int[]{nd, v});
                }
            }
        }
        return -1;
    }
}
