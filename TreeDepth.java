/* PROBLEM ------------------------------------------------------
 * Depth of tree  |  Easy
 * Topics: Tree
 * Return the maximum depth (height) of a binary tree.
 * Example: [3,9,20,null,null,15,7] → 3
 * LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

class TreeDepth {
    static int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return 1 + Math.max(left, right);
    }
}
