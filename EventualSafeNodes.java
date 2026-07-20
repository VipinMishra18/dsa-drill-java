/* PROBLEM ------------------------------------------------------
 * Eventual Safe Nodes  |  Medium
 * Topics: Graph
 * Nodes from which every path eventually reaches a terminal node (no cycle).
 * LeetCode: https://leetcode.com/problems/find-eventual-safe-states/
 */

import java.util.*;

// A node is safe if every path from it leads to a terminal node (no cycle).
class EventualSafeNodes {
    // DFS with recursion-stack detection.
    static List<Integer> dfsSafe(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n], branch = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for (int node = 0; node < n; node++)
            if (!visited[node]) dfs(node, graph, visited, branch, ans);
        Collections.sort(ans);
        return ans;
    }

    private static boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] branch, List<Integer> ans) {
        if (branch[node]) return true;
        if (visited[node]) return false;
        visited[node] = true;
        branch[node] = true;
        for (int nei : graph.get(node))
            if (dfs(nei, graph, visited, branch, ans)) return true;
        branch[node] = false;
        ans.add(node);
        return false;
    }

    // BFS (Kahn's on the reversed graph, peeling terminal nodes).
    static List<Integer> bfsSafe(List<List<Integer>> graph) {
        int n = graph.size();
        int[] outdeg = new int[n];
        List<List<Integer>> rev = new ArrayList<>();
        for (int i = 0; i < n; i++) rev.add(new ArrayList<>());
        for (int u = 0; u < n; u++)
            for (int v : graph.get(u)) {
                rev.get(v).add(u);
                outdeg[u]++;
            }

        Queue<Integer> q = new ArrayDeque<>();
        for (int node = 0; node < n; node++) if (outdeg[node] == 0) q.add(node);

        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            for (int nei : rev.get(node))
                if (--outdeg[nei] == 0) q.add(nei);
        }
        Collections.sort(ans);
        return ans;
    }
}
