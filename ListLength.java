/* PROBLEM ------------------------------------------------------
 * List length  |  Core
 * Topics: Linked List
 * Count the number of nodes in a singly-linked list.
 * Example: 1→2→3 → 3
 */

class ListLength {
    static int len(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans++;
            head = head.next;
        }
        return ans;
    }
}
