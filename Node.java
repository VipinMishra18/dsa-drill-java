/* PROBLEM ------------------------------------------------------
 * Doubly Linked Node  |  Core
 * Topics: Linked List
 * Doubly-linked list node holding key+val (used by DLL / LRU).
 */

// Doubly linked list node with key+val (shared type, used by DLL / LRUCache).
class Node {
    int key, val;
    Node prev, next;
    Node(int k, int v) { key = k; val = v; }
}
