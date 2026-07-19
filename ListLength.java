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
