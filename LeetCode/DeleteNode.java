
//3217
public class DeleteNode {
    public static void main(String[] args) {
        // ListNode[] node = {4,5,1,9} ;
    }

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
        
    

    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
        }
        
}
