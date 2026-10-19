public class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateDepth(root);
        return maxDiameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}