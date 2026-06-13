public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }

        return prevNode;
    }
}