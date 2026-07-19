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
