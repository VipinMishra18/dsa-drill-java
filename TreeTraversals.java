/* PROBLEM ------------------------------------------------------
 * Tree Traversals  |  Easy
 * Topics: Tree
 * Pre-order, in-order, and post-order DFS traversals of a binary tree.
 * Example: in-order of [1,null,2,3] → [1,3,2]
 * LeetCode: https://leetcode.com/problems/binary-tree-inorder-traversal/
 */

import java.util.*;

// The three depth-first orders, each returning the visited values.
class TreeTraversals {
    static List<Integer> preorder(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        pre(root, a);
        return a;
    }

    static List<Integer> inorder(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        in(root, a);
        return a;
    }

    static List<Integer> postorder(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        post(root, a);
        return a;
    }

    private static void pre(TreeNode r, List<Integer> a) {
        if (r == null) return;
        a.add(r.val);        // visit
        pre(r.left, a);
        pre(r.right, a);
    }

    private static void in(TreeNode r, List<Integer> a) {
        if (r == null) return;
        in(r.left, a);
        a.add(r.val);        // visit
        in(r.right, a);
    }

    private static void post(TreeNode r, List<Integer> a) {
        if (r == null) return;
        post(r.left, a);
        post(r.right, a);
        a.add(r.val);        // visit
    }
}
