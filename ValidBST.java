/* PROBLEM ------------------------------------------------------
 * Valid BST  |  Medium
 * Topics: Tree
 * Determine whether a binary tree is a valid BST.
 * Example: [2,1,3] → true, [5,1,4,null,null,3,6] → false
 * LeetCode: https://leetcode.com/problems/validate-binary-search-tree/
 */

class ValidBST {
    static boolean isValidBst(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean dfs(TreeNode root, long left, long right) {
        if (root == null) return true;
        if (!(root.val > left && root.val < right)) return false;
        return dfs(root.left, left, root.val) && dfs(root.right, root.val, right);
    }
}
