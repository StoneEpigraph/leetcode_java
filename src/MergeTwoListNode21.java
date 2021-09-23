
public class MergeTwoListNode21 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        System.out.println(mergeTwoLists(l1, l2));
    }
}


class ListNode {
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