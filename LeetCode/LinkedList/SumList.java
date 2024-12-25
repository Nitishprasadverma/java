package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.w3c.dom.Node;

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

        if (head == null)
            return null;
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

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            head = temp.next;
            boolean isAdded = false;
            while (head != null) {
                if (temp.val < head.val) {
                    list.add(head.val);
                    isAdded = true;
                    break;
                }
                head = head.next;
            }
            if (!isAdded) {
                list.add(0);
            }
            temp = temp.next;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }

    // brute force solution
    public ListNode oddEvenList(ListNode head) {
        if (head == null && head.next == null)
            return head;
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null && temp.next != null) {
            list.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.val);
        }

        temp = head.next;

        while (temp != null && temp.next != null) {
            list.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.val);
        }

        temp = head;
        int indx = 0;
        while (temp != null) {
            temp.val = list.get(indx);
            indx++;
            temp = temp.next;
        }
        return head;
    }

    public ListNode oddEvenListOptimize(ListNode head) {
        if (head == null && head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next.next;
            even = even.next.next;
        }

        odd.next = evenHead;
        return head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // //Brute force with extra space
        // HashSet<ListNode> hasset = new HashSet<>();
        // ListNode head1 = headA;
        // ListNode head2 = headB;
        // int i =0;
        // while (head1 != null) {
        // hasset.add(head1);
        // head1 = head1.next;

        // }

        // while (head2 != null) {
        // if(hasset.contains(head2)) return head2;
        // hasset.add(head2);
        // head2 = head2.next;
        // }
        // return null;

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++

        // while(headB != null){
        // ListNode temp = headA;

        // while (temp != null) {
        // if(temp == headB) return temp;

        // temp = temp.next;
        // }
        // headB = headB.next;
        // }
        // return null;

        // ++++++++++++++++++++++++++++++++++++++++++++
        // Optimize

        // ListNode d1 = headA;
        // ListNode d2 = headB;

        // while (d1 != d2) {
        // d1 = d1 == null? headA:d1.next;
        // d2 = d2 == null?headB:d2.next;
        // }
        // return d1;

        // 99% beats ++++++++++++++++++++++++++++++++++++

        int diff = getDifference(headA, headB);
        if (diff < 0)
            while (diff++ != 0)
                headB = headB.next;
        else
            while (diff-- != 0)
                headA = headA.next;
        while (headA != null) {
            if (headA == headB)
                return headA;
            headB = headB.next;
            headA = headA.next;
        }
        return headA;

    }

    static int getDifference(ListNode head1, ListNode head2) {
        int len1 = 0, len2 = 0;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                ++len1;
                head1 = head1.next;
            }
            if (head2 != null) {
                ++len2;
                head2 = head2.next;
            }

        }
        return len1 - len2;// if difference is neg-> length of list2 > length of list1 else vice-versa
    }

    public ListNode addOne(ListNode head) {
        // code here.
        head = reverseLinkedList(head);

        ListNode temp = head;
        int carry = 1;

        while (temp != null) {

            temp.val = temp.val + carry;

            if (temp.val < 10) {
                carry = 0;
                break;
            } else {
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;

        }

        if (carry == 1) {
            ListNode newnode = new ListNode(1);
            head = reverseLinkedList(head);
            newnode.next = head;
            return newnode;
        }

        head = reverseLinkedList(head);
        return head;

    }

    public static ListNode reverseLinkedList(ListNode head) {
        // Base case:
        // If the linked list is empty or has only one node,
        // return the head as it is already reversed.
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive step:
        // Reverse the linked list starting
        // from the second node (head.next).
        ListNode newHead = reverseLinkedList(head.next);

        // Save a reference to the node following
        // the current 'head' node.
        ListNode front = head.next;

        // Make the 'front' node point to the current
        // 'head' node in the reversed order.
        front.next = head;

        // Break the link from the current 'head' node
        // to the 'front' node to avoid cycles.
        head.next = null;

        // Return the 'newHead,' which is the new
        // head of the reversed linked list.
        return newHead;
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
