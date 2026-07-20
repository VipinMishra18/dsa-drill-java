/* PROBLEM ------------------------------------------------------
 * Topological Sort  |  Medium
 * Topics: Graph
 * Return a topological ordering of a DAG (DFS and Kahn's); empty if cyclic.
 * LeetCode: https://leetcode.com/problems/course-schedule-ii/
 */

import java.util.*;

// n nodes, directed edges [u, v]. Returns empty list if not a DAG.
class TopoSort {
    // DFS: append on exit, then reverse.
    static List<Integer> dfsTopoSort(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) graph.get(e[0]).add(e[1]);

        List<Integer> ans = new ArrayList<>();
        int[] visited = new int[n], branch = new int[n];
        for (int node = 0; node < n; node++) {
            // if any component contains a cycle, the whole graph is not sortable
            if (visited[node] == 0 && dfs(node, graph, visited, branch, ans)) return new ArrayList<>();
        }
        Collections.reverse(ans);
        return ans;
    }

    private static boolean dfs(int node, List<List<Integer>> graph, int[] visited, int[] branch, List<Integer> ans) {
        visited[node] = 1;
        branch[node] = 1;
        for (int nei : graph.get(node)) {
            if (visited[nei] == 0 && dfs(nei, graph, visited, branch, ans)) return true;
            else if (branch[nei] == 1) return true;
        }
        branch[node] = 0;
        ans.add(node);
        return false;
    }

    // BFS (Kahn's algorithm).
    static List<Integer> bfsTopoSort(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegrees = new int[n];
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            indegrees[e[1]]++;
        }

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for (int node = 0; node < n; node++) if (indegrees[node] == 0) q.add(node);

        while (!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            for (int nei : graph.get(node))
                if (--indegrees[nei] == 0) q.add(nei);
        }
        return ans.size() != n ? new ArrayList<>() : ans;
    }
}
