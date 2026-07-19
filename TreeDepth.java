class TreeDepth {
    static int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return 1 + Math.max(left, right);
    }
}
