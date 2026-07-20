/* PROBLEM ------------------------------------------------------
 * Reverse list(Iterative)  |  Easy
 * Topics: Linked List
 * Reverse a singly-linked list iteratively.
 * Example: 1→2→3 → 3→2→1
 * LeetCode: https://leetcode.com/problems/reverse-linked-list/
 */

class ReverseListIterative {
    static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
