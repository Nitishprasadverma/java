package January;

public class Twen4 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
               head = head.next;
           }
               if(head == null) return null;
               ListNode temp = head;
               while(temp != null && temp.next != null){
                   if(temp.next.val == val){
                       temp.next = temp.next.next;
                       
                   }else{
                       temp = temp.next;
                   }
               }
       
               return head;
           }

    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        while (temp != null) {
            if(temp.data == x){
                if(temp == head){
                    head = temp.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.prev;
                if(nextNode != null) nextNode.prev = prevNode;
                if(prevNode != null) prevNode.next = nextNode;
                temp = nextNode;
            }else{
                temp = temp.next;
            }

           
        }
        return head;
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

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

}
