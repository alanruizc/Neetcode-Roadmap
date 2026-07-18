import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("introduce how many nodes do youi want in your list);
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Empty list has no cycles.");
            in.close();
            return;
        }

        ListNode[] nodes = new ListNode[n];
        System.out.println("Enter values for the nodes:");
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + " value: ");
            nodes[i] = new ListNode(in.nextInt());
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        System.out.println("\n--Cycle Configuration--");
        System.out.println("Choose a 0-indexed node for the tail to point back to (0 to " + (n - 1) + ").");
        System.out.print("Enter index (or -1 for no cycle)");
        int pos = in.nextInt();

        if (pos >= 0 && pos < n) {
            nodes[n - 1].next = nodes[pos];
            System.out.println("connected last node to node" + pos);
        } else {
            System.out.println("No cycle created");
        }

        boolean result = sol.hasCycle(nodes[0]);
        System.out.println("\n--Results--");
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        in.close();
    }
}