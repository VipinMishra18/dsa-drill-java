/* PROBLEM ------------------------------------------------------
 * Is Bipartite Graph  |  Medium
 * Topics: Graph
 * Can the graph be 2-colored so no edge joins same-color nodes?
 * LeetCode: https://leetcode.com/problems/is-graph-bipartite/
 */

import java.util.*;

// 2-color the graph; fail if two adjacent nodes must share a color.
class IsBipartite {
    static boolean isBipartite(List<List<Integer>> graph) {
        int n = graph.size();
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int i = 0; i < n; i++)
            if (colors[i] == -1 && !dfs(i, 0, graph, colors)) return false;
        return true;
    }

    private static boolean dfs(int i, int color, List<List<Integer>> graph, int[] colors) {
        colors[i] = color;
        for (int nei : graph.get(i)) {
            if (colors[nei] == -1) {
                if (!dfs(nei, color ^ 1, graph, colors)) return false;
            } else if (colors[nei] == color) {
                return false;
            }
        }
        return true;
    }
}
