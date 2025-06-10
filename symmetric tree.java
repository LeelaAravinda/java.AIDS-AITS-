class Solution {
    public boolean isSymmetric(TreeNode root) {
        return getNode(root.left, root.right);
    }
    public boolean getNode(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return n1.val == n2.val && getNode(n1.left, n2.right) && getNode(n1.right, n2.left);
    }
}