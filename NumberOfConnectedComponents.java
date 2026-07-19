import java.util.*;

// graph = adjacency list. Count connected components via DFS.
class NumberOfConnectedComponents {
    static int numberOfConnectedComponent(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] vis = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                components++;
                dfs(i, graph, vis);
            }
        }
        return components;
    }

    private static void dfs(int u, List<List<Integer>> graph, boolean[] vis) {
        vis[u] = true;
        for (int v : graph.get(u)) if (!vis[v]) dfs(v, graph, vis);
    }
}
