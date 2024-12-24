package LinkedList;

public class SumList {

    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        temp.next = head;// link last node to the head node

        k = k % length;

        int end = length - k;// end of the list

        while ((end-- != 0)) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return head;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;
        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == n) {
            ListNode newHead = head.next;
            head = null;
            return newHead;

        }
        int reslt = cnt - n;
        temp = head;

        while (temp != null) {
            reslt--;

            if (reslt == 0) {
                break;
            }
            temp = temp.next;
        }

        // ListNode deleteNode = temp.next;
        temp.next = temp.next.next;

        return head;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;

        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {

            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);

            temp.next = node;
            temp = temp.next;
        }
        return dummyNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
