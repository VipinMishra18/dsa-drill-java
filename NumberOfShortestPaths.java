/* PROBLEM ------------------------------------------------------
 * Number of Shortest Paths  |  Medium
 * Topics: Graph
 * Count the shortest paths from node 0 to node n-1 in a weighted graph.
 * LeetCode: https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/
 */

import java.util.*;

// Count shortest paths from node 0 to node n-1 in a weighted undirected graph.
class NumberOfShortestPaths {
    static int numberOfShortestPaths(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] road : roads) {
            int u = road[0], v = road[1], w = road[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        int[] dist = new int[n], ways = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // {dist, node}
        pq.add(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0], u = top[1];
            for (int[] edge : graph.get(u)) {
                int v = edge[0], w = edge[1];
                int nd = d + w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    ways[v] = ways[u];
                    pq.add(new int[]{nd, v});
                } else if (nd == dist[v]) {
                    ways[v] += ways[u];
                }
            }
        }
        return ways[n - 1];
    }
}
