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
