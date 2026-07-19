class InvertBinaryTree {
    static TreeNode invert(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invert(root.left);
        root.left = invert(root.right);
        root.right = left;
        return root;
    }
}
