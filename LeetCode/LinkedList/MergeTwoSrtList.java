package LinkedList;

public class MergeTwoSrtList {
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

    public boolean isPalindrome(ListNode head){
        ListNode mid  = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode reverseHead = secondHead;

        while (head != null && secondHead != null) {
            if(head.val != secondHead.val) break;

            head = head.next;
            secondHead = secondHead.next;

        }

        reverseList(reverseHead);
        return head == null || secondHead == null;
    }


    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
          ListNode prev = null;
      ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next  = next.next;
            }
           
        }
             return prev;
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
    public static void main(String[] args) {
        
    }
}
