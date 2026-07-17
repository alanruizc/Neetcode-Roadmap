import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.println("Enter your tree in level-order and separated by spaces");
        System.out.println("Use 'null' for empty nodes (e.g., 4 2 7 1 3 6 9 or 2 1 3):");
        System.out.print("> ");

        String line = in.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("tree is empty.");
            in.close();
            return;
        }

        String[] values = line.split("\\s+");
        TreeNode root = buildTree(values);

        System.out.print("\nOriginal Tree (Level-Order): ");
        printLevelOrder(root);
        TreeNode invertedRoot = sol.invertTree(root);

        System.out.print("Inverted Tree (Level-Order): ");
        printLevelOrder(invertedRoot);

        in.close();
    }

    private static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equalsIgnoreCase("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (i < values.length && !values[i].equalsIgnoreCase("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].equalsIgnoreCase("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    private static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder("[");

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                sb.append(curr.val).append(", ");
                queue.add(curr.left);
                queue.add(curr.right);
            } else {
                if (hasMoreNodes(queue)) {
                    sb.append("null, ");
                }
            }
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    private static boolean hasMoreNodes(Queue<TreeNode> queue) {
        for (TreeNode node : queue) {
            if (node != null) return true;
        }
        return false;
    }
}