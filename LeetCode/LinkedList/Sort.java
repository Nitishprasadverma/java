package LinkedList;

public class Sort {
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

    // ListNode head;

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;

            } else {
                tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;

        }
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return dummyHead.next;
    }

    ListNode getMid(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
