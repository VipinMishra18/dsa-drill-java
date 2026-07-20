/* PROBLEM ------------------------------------------------------
 * Same Tree | Symmetric Tree  |  Easy
 * Topics: Tree
 * Are two binary trees structurally identical with equal values? (+
 * symmetric variant)
 * Example: [1,2,3] vs [1,2,3] → true
 * LeetCode: https://leetcode.com/problems/same-tree/
 */

class SameTree {
    static boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
    }

    // Symmetric = flip the branches when comparing.
    static boolean symmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return symmetric(root1.left, root2.right) && symmetric(root1.right, root2.left);
    }
}
