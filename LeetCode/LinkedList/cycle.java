package LinkedList;

public class cycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }
        return false;
    }

    // find length of cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // caculate the length
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }

        }
        return -1;
    }

    public ListNode detectCyle(ListNode head){
        int length = 0;
        ListNode fast = head; 
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                length = lengthCycle(slow);
                break;
            }
                
        }

        if(length == 0) return null;

        //finding the start node
        ListNode f = head;
        ListNode s = head;
        while (length >0) {
            s = s.next;
            length--;
        }

        //keep moving both forward and they will meet at thr cycle start

        while (f != s) {
            f = f.next;
            s = s.next;
            
        }
        return s;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
