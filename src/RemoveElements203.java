
public class RemoveElements203 {


    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements1(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode temp = preHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();

        System.out.println(removeElements(l1, 1));
    }
}
