public class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode leftInv = invertTree(root.left);
        TreeNode rightInv = invertTree(root.right);

        root.left = rightInv;
        root.right = leftInv;

        return root;
    }
}