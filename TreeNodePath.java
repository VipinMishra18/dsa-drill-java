import java.util.*;

// Fills `ans` with the root->target path; returns whether target was found.
class TreeNodePath {
    static boolean path(TreeNode root, TreeNode target, List<TreeNode> ans) {
        if (root == null) return false;
        ans.add(root);
        if (root == target) return true;
        if (path(root.left, target, ans) || path(root.right, target, ans)) return true;
        ans.remove(ans.size() - 1);
        return false;
    }
}
