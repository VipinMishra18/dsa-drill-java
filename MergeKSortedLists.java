/* PROBLEM ------------------------------------------------------
 * Merge K Sorted Lists  |  Hard
 * Topics: Heap, Linked List
 * Merge k sorted linked lists into one sorted list (min-heap).
 * Example: [[1,4,5],[1,3,4],[2,6]] → 1→1→2→3→4→4→5→6
 * LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/
 */

import java.util.*;

// Min-heap of list heads; always extend the result with the smallest.
class MergeKSortedLists {
    static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode l : lists) if (l != null) pq.add(l);

        ListNode dummy = new ListNode(), tail = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = node;
            if (node.next != null) pq.add(node.next);
        }
        return dummy.next;
    }
}
