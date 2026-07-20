/* PROBLEM ------------------------------------------------------
 * Doubly linked list  |  Core
 * Topics: Doubly Linked List
 * Doubly-linked list with sentinel head/tail; supports the LRU cache.
 */

// Partial doubly linked list with sentinel head/tail.
// Built to support LRU Cache for now (matches the original note).
class DLL {
    Node head, tail;

    DLL() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    void insertFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    Node getLast() {
        if (tail.prev == head) return null;
        return tail.prev;
    }
}
