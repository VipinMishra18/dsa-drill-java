/* PROBLEM ------------------------------------------------------
 * Tree Diameter  |  Easy
 * Topics: Tree
 * Longest path (in edges) between any two nodes; may not pass the root.
 * Example: [1,2,3,4,5] → 3
 * LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
 */

// Diameter = longest path (in edges) between any two nodes; may not pass root.
class TreeDiameter {
    static int treeDiameter(TreeNode root) {
        int[] ans = {0};
        depth(root, ans);
        return ans[0];
    }

    private static int depth(TreeNode root, int[] ans) {
        if (root == null) return 0;
        int left = depth(root.left, ans);
        int right = depth(root.right, ans);
        ans[0] = Math.max(ans[0], left + right); // left+right = edges; +1 = nodes
        return 1 + Math.max(left, right);
    }
}
