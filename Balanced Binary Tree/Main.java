public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // balanced binary tree [3, 9, 20, null, null, 15, 7]
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        TreeNode balancedTree = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        // unbalanced binary tree case [1, 2, 2, 3, 3, null, null, 4, 4]
        //           1
        //          / \
        //         2   2
        //        / \
        //       3   3
        //      / \
        //     4   4
        TreeNode unbalancedTree = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)
                ),
                new TreeNode(2)
        );

        // Empty Tree case []
        TreeNode emptyTree = null;
        System.out.println("balanced binary tree checks");
        System.out.println("case1 test (Expected: true):  " + solution.isBalanced(balancedTree));
        System.out.println("case2 test (Expected: false): " + solution.isBalanced(unbalancedTree));
        System.out.println("case3 test (Expected: true):  " + solution.isBalanced(emptyTree));
    }
}