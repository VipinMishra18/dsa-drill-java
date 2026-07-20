/* PROBLEM ------------------------------------------------------
 * Serialize/Deserialize Tree  |  Hard
 * Topics: Tree, Design
 * Encode a binary tree to a string and decode it back.
 * LeetCode: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */

import java.util.*;

// Preorder with '#' for nulls, comma-separated.
class SerializeDeserializeTree {
    static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        ser(root, sb);
        return sb.toString();
    }

    private static void ser(TreeNode n, StringBuilder sb) {
        if (n == null) { sb.append("#,"); return; }
        sb.append(n.val).append(',');
        ser(n.left, sb);
        ser(n.right, sb);
    }

    static TreeNode deserialize(String data) {
        return de(new ArrayDeque<>(Arrays.asList(data.split(","))));
    }

    private static TreeNode de(Deque<String> nodes) {
        String v = nodes.poll();
        if (v.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(v));
        node.left = de(nodes);
        node.right = de(nodes);
        return node;
    }
}
