/* PROBLEM ------------------------------------------------------
 * Cycle in Directed Graph  |  Medium
 * Topics: Graph
 * Detect a cycle in a directed graph (DFS recursion-stack and Kahn's BFS).
 * LeetCode: https://leetcode.com/problems/course-schedule/
 */

import java.util.*;

// graph = adjacency list of a directed graph.
class CycleDirectedGraph {
    // DFS with a recursion-stack (branch) marker.
    static boolean dfsCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n], branch = new boolean[n];
        for (int i = 0; i < n; i++)
            if (!visited[i] && dfs(i, graph, visited, branch)) return true;
        return false;
    }

    private static boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] branch) {
        visited[node] = true;
        branch[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei] && dfs(nei, graph, visited, branch)) return true;
            if (branch[nei]) return true;
        }
        branch[node] = false;
        return false;
    }

    // BFS (Kahn's): a cycle exists if not every node gets processed.
    static boolean bfsCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        int[] indegrees = new int[n];
        for (int node = 0; node < n; node++)
            for (int nei : graph.get(node)) indegrees[nei]++;

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (indegrees[i] == 0) q.add(i);

        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            for (int nei : graph.get(node))
                if (--indegrees[nei] == 0) q.add(nei);
        }
        return count != n;
    }
}
