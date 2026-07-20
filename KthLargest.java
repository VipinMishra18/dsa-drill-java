/* PROBLEM ------------------------------------------------------
 * Kth Largest Element  |  Medium
 * Topics: Heap
 * Find the k-th largest element (min-heap of size k).
 * Example: [3,2,1,5,6,4], k=2 → 5
 * LeetCode: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

import java.util.*;

// Kth largest via a size-k min-heap: the root is the answer.
class KthLargest {
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
        for (int x : nums) {
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
