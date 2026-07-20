/* PROBLEM ------------------------------------------------------
 * Copy list  |  Core
 * Topics: Linked List
 * Create a deep copy of a singly-linked list.
 */

class CopyList {
    static ListNode copyList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while (head != null) {
            temp.next = new ListNode(head.val);
            temp = temp.next;
            head = head.next;
        }
        return dummy.next;
    }
}
