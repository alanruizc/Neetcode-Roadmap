public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Test Case 1: Standard Tree [1, 2, 3, 4, 5]
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        // Longest path: [4 -> 2 -> 1 -> 3] or [5 -> 2 -> 1 -> 3] (Length: 3 edges)
        TreeNode tree1 = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );

        // Test Case 2: Linear Path [1, 2]
        //      1
        //     /
        //    2
        // Longest path: [2 -> 1] (Length: 1 edge)
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), null);

        // Test Case 3: Diameter does NOT pass through the root
        //           1
        //          /
        //         2
        //        / \
        //       3   4
        //      /     \
        //     5       6
        // Longest path: [5 -> 3 -> 2 -> 4 -> 6] (Length: 4 edges)
        TreeNode tree3 = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3, new TreeNode(5), null),
                        new TreeNode(4, null, new TreeNode(6))
                ),
                null
        );

        System.out.println("Diameter of binary tree checks);
        System.out.println("case1 test (Expected: 3): " + solution.diameterOfBinaryTree(tree1));
        System.out.println("case2 test (Expected: 1): " + solution.diameterOfBinaryTree(tree2));
        System.out.println("case3 test (Expected: 4): " + solution.diameterOfBinaryTree(tree3));
    }
}