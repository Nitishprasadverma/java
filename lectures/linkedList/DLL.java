package linkedList;

public class DLL {

    private Node head;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;

        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;// bcz will be insert at last so it's next will ofc. null
        if (head == null) {
            node.prev = null;

            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertAt(int val, int index) {

        if(index <0 || index > size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);

        node.next = temp.next;
        node.prev = temp;

        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
        size++;

    }

    public void insertAfter(int after, int val) {
        Node p = findNode(after);

        if (p == null) {
            System.out.println("Does not exist this node");
            return;
        }
        Node node = new Node(val);
        // if(p.next != null){
        // node.next = p.next;
        // }else{
        // node.next = null;
        // }
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public Node findNode(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val)
                return node;
            node = node.next;// moving to the next node
        }
        return null;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("end");
    }

    public void displayRev() {
        Node node = head;
        Node last = null;

        // extracting last node via this loop
        while (node != null) {
            // System.out.print(node.val + " -> ");
            last = node;
            node = node.next;

        }
        // System.out.println("end");
        while (last != null) {
            System.out.print(last.val + " -> ");

            last = last.prev;
        }
        System.out.println("end");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        // public Node(int val, Node next, Node prev) {
        //     this.val = val;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }

}