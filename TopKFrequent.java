/* PROBLEM ------------------------------------------------------
 * Top K Frequent Elements  |  Medium
 * Topics: Heap, Hash Map
 * Return the k most frequent elements.
 * Example: [1,1,1,2,2,3], k=2 → [1,2]
 * LeetCode: https://leetcode.com/problems/top-k-frequent-elements/
 */

import java.util.*;

class TopKFrequent {
    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.merge(x, 1, Integer::sum);

        // min-heap by frequency, size capped at k: {value, count}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            pq.add(new int[]{e.getKey(), e.getValue()});
            if (pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) ans[i] = pq.poll()[0];
        return ans;
    }
}
