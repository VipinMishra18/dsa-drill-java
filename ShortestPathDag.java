/* PROBLEM ------------------------------------------------------
 * Shortest Path Directed Acyclic Graph  |  Medium
 * Topics: Graph
 * Single-source shortest paths in a weighted DAG (topo order + relax).
 */

import java.util.*;

// Single-source shortest paths in a weighted DAG: topo order (DFS stack), then relax.
class ShortestPathDag {
    static int[] shortestPath(List<List<int[]>> graph, int src) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int node = 0; node < n; node++)
            if (!visited[node]) dfs(node, graph, visited, stack);

        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            // Nodes before src in topo order are unreachable, so they stay at INF.
            if (ans[node] != Integer.MAX_VALUE) {
                for (int[] edge : graph.get(node)) {
                    int nei = edge[0], w = edge[1];
                    ans[nei] = Math.min(ans[nei], ans[node] + w);
                }
            }
        }
        return ans;
    }

    private static void dfs(int node, List<List<int[]>> graph, boolean[] visited, Deque<Integer> stack) {
        if (visited[node]) return;
        visited[node] = true;
        for (int[] edge : graph.get(node)) dfs(edge[0], graph, visited, stack);
        stack.push(node);
    }
}
