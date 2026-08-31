public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        maxDepth(root, max);
        return max[0];
    }

    private int maxDepth(TreeNode node, int[] max) {
        if (node == null) return 0;

        int left = maxDepth(node.left, max);
        int right = maxDepth(node.right, max);

        max[0] = Math.max(max[0], left + right);
        return 1 + Math.max(left, right);
    }
}