/* PROBLEM ------------------------------------------------------
 * Invert Binary Tree  |  Easy
 * Topics: Tree
 * Mirror a binary tree by swapping every node's children.
 * Example: [4,2,7,1,3,6,9] → [4,7,2,9,6,3,1]
 * LeetCode: https://leetcode.com/problems/invert-binary-tree/
 */

class InvertBinaryTree {
    static TreeNode invert(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invert(root.left);
        root.left = invert(root.right);
        root.right = left;
        return root;
    }
}
