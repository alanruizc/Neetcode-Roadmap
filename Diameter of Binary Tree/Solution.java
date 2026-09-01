public class Solution {
    private int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return maxDiameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        int pathThroughNode = leftDepth + rightDepth;
        maxDiameter = Math.max(maxDiameter, pathThroughNode);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}