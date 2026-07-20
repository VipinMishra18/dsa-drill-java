/* PROBLEM ------------------------------------------------------
 * Sub Tree  |  Easy
 * Topics: Tree
 * Is subTree an exact subtree of root?
 * LeetCode: https://leetcode.com/problems/subtree-of-another-tree/
 */

class SubTree {
    static boolean isSubTree(TreeNode root, TreeNode subTree) {
        if (root == null) return false;
        if (subTree == null) return true;
        if (SameTree.sameTree(root, subTree)) return true;
        return isSubTree(root.left, subTree) || isSubTree(root.right, subTree);
    }
}
