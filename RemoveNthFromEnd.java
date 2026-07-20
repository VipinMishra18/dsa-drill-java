/* PROBLEM ------------------------------------------------------
 * Remove Nth from end  |  Medium
 * Topics: Linked List
 * Remove the n-th node from the end of the list.
 * Example: 1→2→3→4→5, n=2 → 1→2→3→5
 * LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

class RemoveNthFromEnd {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        int l = ListLength.len(head);
        if (n == l) {
            return head.next;
        }
        ListNode temp = head;
        int skip = l - n - 1;
        while (skip-- > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // unlink (Java GC handles the delete)
        return head;
    }
}
