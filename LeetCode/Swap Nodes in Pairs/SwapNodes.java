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

    public static void main(String[] args) {
        // Example: head = [1, 2, 3, 4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        SwapNodes solution = new SwapNodes();
        ListNode result = solution.swapPairs(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

/*
Pseudocode:
1. If the list is empty or has only one node, return the head.
2. Initialize a dummy node and set its next to the head.
3. Initialize a pointer 'current' to the dummy node.
4. Traverse the list while there are at least two more nodes to process:
   a. Identify the first and second nodes to be swapped.
   b. Swap the nodes by adjusting their 'next' pointers.
   c. Move the 'current' pointer to the next pair of nodes.
5. Return the new head of the list, which is dummy.next.

Time Complexity: O(n), where n is the number of nodes in the list.
Space Complexity: O(1), as we are using a constant amount of extra space.
*/
