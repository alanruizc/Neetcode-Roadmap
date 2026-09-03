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
        int sum = leftDepth + rightDepth;
        if (sum > maxDiameter) {
            maxDiameter = sum;
        }
        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}