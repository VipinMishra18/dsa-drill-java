import java.util.*;

// Convert a binary tree into an undirected adjacency-list graph keyed by node value.
class TreeToGraph {
    static Map<Integer, List<Integer>> treeToGraph(TreeNode root) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        build(root, null, graph);
        return graph;
    }

    private static void build(TreeNode r, TreeNode p, Map<Integer, List<Integer>> graph) {
        if (r != null && p != null) {
            graph.computeIfAbsent(p.val, k -> new ArrayList<>()).add(r.val);
            graph.computeIfAbsent(r.val, k -> new ArrayList<>()).add(p.val);
        }
        if (r.left != null) build(r.left, r, graph);
        if (r.right != null) build(r.right, r, graph);
    }
}
