package lectures.linkedList;

public class CLL {
private Node head;
private Node tail;



public CLL(){
    this.tail = null;
    this.head = null;
    
}

public void insert(int val){
    Node node = new Node(val);
    if(head == null){
        head = node;
        tail = node;
        return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
}

public void delete(int val){
    Node node = head;
    if(node == null){
        return;
    }

    if(node.val == val){
head = head.next;
tail.next = head;
return;
    }

    do{
        Node n = node.next;// next node to the head node

        if(n.val == val){
            node.next = n.next; // just before the deleting node will nw link to the just after the deleted node
            break;
        }
        node = node.next;
        
      
    }  while(node != head);
}

public void display(){
    Node node = head;
    if(head != null){
        do{
            System.out.print(node.val + " -> ");
            node = node.next;
        }while(node != head);
        System.out.print("head");
    }
    System.out.println();
}
   private class Node {
   int val;
    
   Node next;

    public Node(int val){
        this.val = val;
    }
    
    
   } 
}
