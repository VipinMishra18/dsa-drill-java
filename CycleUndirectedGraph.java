import java.util.*;

// graph = adjacency list of an undirected graph.
class CycleUndirectedGraph {
    // DFS: a visited neighbor that isn't the parent means a cycle.
    static boolean dfsCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++)
            if (!visited[i] && dfs(i, -1, graph, visited)) return true;
        return false;
    }

    private static boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node, graph, visited)) return true;
            } else if (nei != parent) {
                return true;
            }
        }
        return false;
    }

    // BFS: carry each node's parent through the queue.
    static boolean bfsCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            Queue<int[]> q = new ArrayDeque<>();
            q.add(new int[]{i, -1});
            visited[i] = true;
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int node = cur[0], parent = cur[1];
                for (int nei : graph.get(node)) {
                    if (!visited[nei]) {
                        visited[nei] = true;
                        q.add(new int[]{nei, node});
                    } else if (nei != parent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
