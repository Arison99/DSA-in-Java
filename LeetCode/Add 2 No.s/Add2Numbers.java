class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize dummy head and pointers
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        
        // Traverse both lists
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        // Check for remaining carry
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        // Return the result list
        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Add2Numbers solution = new Add2Numbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

/*
Pseudo code:
1. Initialize dummy head and pointers for both lists.
2. Traverse both lists:
   a. Sum the values of the current nodes and carry.
   b. Update carry.
   c. Create a new node with the sum's unit place value.
   d. Move to the next nodes.
3. Check for remaining carry and create a new node if necessary.
4. Return the result list starting from dummy head's next node.

Time Complexity: O(max(m, n)) where m and n are the lengths of the input lists.
Space Complexity: O(max(m, n)) for the result list.
*/
