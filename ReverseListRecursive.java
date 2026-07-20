/* PROBLEM ------------------------------------------------------
 * Reverse list(Recursive)  |  Easy
 * Topics: Linked List
 * Reverse a singly-linked list recursively.
 * Example: 1→2→3 → 3→2→1
 * LeetCode: https://leetcode.com/problems/reverse-linked-list/
 */

class ReverseListRecursive {
    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
