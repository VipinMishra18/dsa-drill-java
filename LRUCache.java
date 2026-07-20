/* PROBLEM ------------------------------------------------------
 * LRU cache  |  Medium
 * Topics: Doubly Linked List, Implementation
 * Design an LRU cache with O(1) get and put; evict least-recently-used on
 * overflow.
 * Example: cap=2: put(1,1),put(2,2),get(1)=1,put(3,3) evicts key 2
 * LeetCode: https://leetcode.com/problems/lru-cache/
 */

import java.util.*;

// PUT() -> O(1), GET() -> O(1)
class LRUCache {
    private int capacity;
    private DLL list = new DLL();
    private Map<Integer, Node> mp = new HashMap<>();

    LRUCache(int cap) {
        capacity = cap;
    }

    int get(int k) {
        if (!mp.containsKey(k)) return -1;
        Node node = mp.get(k);
        list.remove(node);
        list.insertFront(node);
        return node.val;
    }

    void put(int k, int v) {
        if (capacity == 0) return;

        if (mp.containsKey(k)) {
            Node node = mp.get(k);
            node.val = v;
            list.remove(node);
            list.insertFront(node);
        } else {
            if (mp.size() == capacity) {
                Node node = list.getLast();
                mp.remove(node.key);
                list.remove(node);
            }
            Node node = new Node(k, v);
            list.insertFront(node);
            mp.put(k, node);
        }
    }
}
