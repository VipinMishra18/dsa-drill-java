class RemoveNthFromEnd {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        int l = ListLength.len(head);
        if (n == l) {
            return head.next;
        }
        ListNode temp = head;
        int skip = l - n - 1;
        while (skip-- > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // unlink (Java GC handles the delete)
        return head;
    }
}
