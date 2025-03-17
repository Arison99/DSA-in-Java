class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNode {
    // ...existing code...

    /**
     * Removes the nth node from the end of the list and returns the head of the modified list.
     * Time Complexity: O(L) where L is the length of the linked list.
     * Space Complexity: O(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Skip the desired node
        second.next = second.next.next;
        
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        DeleteNode solution = new DeleteNode();
        
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Remove the 2nd node from the end: 1 -> 2 -> 3 -> 5
        ListNode result = solution.removeNthFromEnd(head, 2);
        
        // Print the modified list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
