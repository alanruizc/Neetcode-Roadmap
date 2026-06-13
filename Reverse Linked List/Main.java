import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution1 sol = new Solution1();

        System.out.print("Set how many elements do you want in the linked list ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty.");
            in.close();
            return;
        }

        System.out.println("Enter the elements one by one:");

        System.out.print("Element 1: ");
        ListNode head = new ListNode(in.nextInt());
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Element " + i + ": ");
            current.next = new ListNode(in.nextInt());
            current = current.next;
        }
        System.out.print("\nOriginal List: ");
        printList(head);
        ListNode reversedHead = sol.reverseList(head);
        System.out.print("Reversed List: ");
        printList(reversedHead);

        in.close();
    }
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}