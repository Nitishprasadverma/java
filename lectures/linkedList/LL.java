package lectures.linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int val, int index) {
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

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAt(int index) {
        if (size <= 1)
            return deleteFirst();
        if (index == size - 1)
            deleteLast();

        Node prev = get(index - 1);
        int val = prev.next.value;// the value which is being delete

        prev.next = prev.next.next;// mean the node before deleting node is linked to the node with whom deleted
                                   // node was linked mean previous linked to deleted and deleted to next so
                                   // next.next

        size--;
        return val;

    }

    public Node findNode(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val)
                return node;
            node = node.next;// moving to the next node
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " " + "  -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if(f.value < s.value
             ){
                ans.insertFirst(f.value);
                f = f.next;
             }else {
                ans.insertFirst(s.value);
                s = s.next;
             }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;

    }

    // in case if the tail is given  to us , using resursion
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //when tail is not given to us inplace reversal

    public void reverse(){
        if(size < 2) return;

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next  = next.next;
            }
           
        }
             head = prev;

             // in case of returning node will return directly prev as it will be our head
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    public static void main(String[] args) {
       LL first = new LL();
       LL second = new LL();
       
       
       first.insertLast(1);
       first.insertLast(34);
       first.insertLast(23);
       first.insertLast(56);

       second.insertLast(90);
       second.insertLast(78);
       second.insertLast(68);
       second.insertLast(45);

       LL ans = LL.merge(first, second);
      ans.display();

    }
}
