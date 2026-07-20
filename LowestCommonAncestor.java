/* PROBLEM ------------------------------------------------------
 * Lowest Common Ancestor  |  Medium
 * Topics: Tree
 * Lowest common ancestor of two nodes in a binary tree.
 * LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */

// LCA in a general binary tree: the node where p and q split.
class LowestCommonAncestor {
    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
