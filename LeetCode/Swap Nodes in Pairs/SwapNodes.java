class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list and swap pairs
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap the nodes
            first.next = second.next;
            current.next = second;
            current.next.next = first;

            // Move to the next pair
            current = current.next.next;
        }

        return dummy.next;
    }
}
