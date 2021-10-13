public class IsPalindrome234 {
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        // 找到前半部分的尾结点
        ListNode preHalfEndNode = getPrefHarlfEndNode(head);
        // 翻转后半部分节点
        ListNode sufHalfFirstNode = reverseListNode(preHalfEndNode);

        // 对比两个子ListNode, 判断是否是回文
        ListNode p1 = head;
        ListNode p2 = sufHalfFirstNode;
        boolean res = true;
        while (res && p2.next != null) {
            if (p1.val != p2.val) {
                res = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        preHalfEndNode.next = reverseListNode(sufHalfFirstNode);
        return res;
    }

    public ListNode getPrefHarlfEndNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
}
