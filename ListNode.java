/* PROBLEM ------------------------------------------------------
 * List Node  |  Core
 * Topics: Linked List
 * Singly-linked list node definition (shared building block).
 */

// Singly linked list node (shared type).
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
