public class DeleteNode237 {
    public void deleteNode(ListNode node) {
        ListNode pre = null;
        while (node != null) {
            if (node.next == null) {
                node = null;
                pre.next = null;
            } else {
                node.val = node.next.val;
                pre = node;
                node = node.next;
            }
        }
    }
}
