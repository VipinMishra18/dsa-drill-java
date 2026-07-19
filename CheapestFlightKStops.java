import java.util.*;

// Cheapest src->dst using at most k stops. Dijkstra over (cost, node, steps).
class CheapestFlightKStops {
    static int findCheapestFlight(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] f : flights) graph.get(f[0]).add(new int[]{f[1], f[2]});

        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[src][0] = 0;

        int ans = -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // {cost, node, steps}
        pq.add(new int[]{0, src, 0});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0], node = top[1], steps = top[2];
            if (node == dst) {
                ans = d;
                break;
            }
            if (steps > k) continue;
            for (int[] edge : graph.get(node)) {
                int nei = edge[0], w = edge[1];
                if (d + w < dist[nei][steps + 1]) {
                    dist[nei][steps + 1] = d + w;
                    pq.add(new int[]{d + w, nei, steps + 1});
                }
            }
        }
        return ans;
    }
}
