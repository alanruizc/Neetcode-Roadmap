/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftHeight = getMaxHeight(root.left);
        int rightHeight = getMaxHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int getMaxHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getMaxHeight(node.left), getMaxHeight(node.right));
    }
}