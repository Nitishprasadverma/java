package lectures.linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(30);
        list.insertFirst(43);
        list.insertFirst(8);
        list.insertFirst(80);
        list.insertFirst(23);
        list.display();

        list.insertLast(78);
        list.display();

        list.insertAt(56, 4);
        list.display();

        System.out.println(list.deleteFirst());
        
        list.display();

      System.out.println(  list.deleteLast());
        list.display();

        System.out.println( list.deleteAt(1));
       
        list.display();

        System.out.println(list.findNode(40));
        
        list.display();
    }


    
}
