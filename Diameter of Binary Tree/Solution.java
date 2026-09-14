public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = new int[1];
        calculateDepth(root, maxDiameter);
        return maxDiameter[0];
    }

    private int calculateDepth(TreeNode node, int[] maxDiameter) {
        if (node == null) {
            return 0;
        }

        int leftDepth = calculateDepth(node.left, maxDiameter);
        int rightDepth = calculateDepth(node.right, maxDiameter);

        int currentPath = leftDepth + rightDepth;
        if (currentPath > maxDiameter[0]) {
            maxDiameter[0] = currentPath;
        }

        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}