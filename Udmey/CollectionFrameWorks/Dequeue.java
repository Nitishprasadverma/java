package CollectionFrameWorks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeqAsQue = new ArrayDeque<>();

        //insertion
        arrayDeqAsQue.addLast(1);
        arrayDeqAsQue.addLast(5);
        arrayDeqAsQue.addLast(10);

        //Deletion

        int element = arrayDeqAsQue.removeFirst();

        System.out.println(element);

        //Lifo

        ArrayDeque<Integer> arrayDeqAsStack = new ArrayDeque<>();

        arrayDeqAsStack.addFirst(1);
        arrayDeqAsStack.addFirst(5);
        arrayDeqAsStack.addFirst(10);


        //Deletion

        int removeElem = arrayDeqAsStack.removeFirst();
        System.out.println(removeElem);


        //List

          List<Integer> list1 = new ArrayList<>();

        // add(int index, Element e)
        list1.add(0, 100);
        list1.add(1, 200);
        list1.add(2, 300);

        // addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0, 400);
        list2.add(1, 500);
        list2.add(2, 600);

        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.println(val));

        // replaceAll(UnaryOperator op)
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("after replace all");
        list1.forEach((Integer val) -> System.out.println(val));

        // sort(Comparator c)
        list1.sort((Integer val1, Integer val2) -> val1 - val2);
        System.out.println("after sorting in increasing order");
        list1.forEach((Integer val) -> System.out.println(val));

        // get(int index)
        System.out.println("value present at index 2 is: " + list1.get(2));

        // set(int index, Element e)
        list1.set(2, -400);
        System.out.println("after set method");

        list1.forEach((Integer val) -> System.out.println(val));

        // remove(int index)
        list1.remove(2);
        System.out.println("after removing");
        list1.forEach((Integer val) -> System.out.println(val));

        // indexOf(Object o)
        System.out.println("index of -200 Integer object is: " + list1.indexOf(-200));

        // need to provide the index in ListIterator, from where it has to start.
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        // traversing backward direction
        while (listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();

            System.out.println(
                "traversing backward: " + previousVal
                + " nextIndex: " + listIterator1.nextIndex()
                + " previous index: " + listIterator1.previousIndex()
            );

            if (previousVal == -100) {
                listIterator1.set(-50);
            }
        }

        list1.forEach((Integer val) -> System.out.println("after set: " + val));

        // traversing forward direction
        ListIterator<Integer> listIterator2 = list1.listIterator();

        while (listIterator2.hasNext()) {
            int val = listIterator2.next();

            System.out.println(
                "traversing forward: " + val
                + " nextIndex: " + listIterator2.nextIndex()
                + " previous index: " + listIterator2.previousIndex()
            );

            if (val == -200) {
                listIterator2.add(-100);
            }
        }

        list1.forEach((Integer val) -> System.out.println("after add: " + val));

        List<Integer> subList = list1.subList(1, 4);
        subList.forEach((Integer val) -> System.out.println("subList: " + val));

        subList.add(-900);

        list1.forEach((Integer val) ->
            System.out.println("after value added in subList: " + val)
        );


        //Thread SafeVersion of List

        List<Integer> list = new CopyOnWriteArrayList<>();

        list.add(0,100);
        System.out.println(list.get(0));

        //LinkedList+++++++++++++++++++++++++++++++++++++++++++++++++

        LinkedList<Integer> Linkedlist1 = new LinkedList<>();

       Linkedlist1.addLast(200);

       Linkedlist1.addLast(300);
       Linkedlist1.addLast(400);
       Linkedlist1.addLast(100);

       System.out.println(Linkedlist1.getFirst());

       LinkedList<Integer> list3 = new LinkedList<>();

       list3.add(0,100);
       list3.add(1,300);
       list3.add(2,400);
       list3.add(1,200);

       System.out.println(list3.get(1) + "and " + list3.get(2));
    }

}


