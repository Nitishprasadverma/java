package lectures.OOP.collection;

// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       
        //  List<Integer> list = new ArrayList<>();

         List<Integer> list2 = new LinkedList<>();

         list2.add(23);
         list2.add(34);
         list2.add(22);
         list2.add(29);
         list2.add(43);
         System.out.println(list2);


         List<Integer> vector = new Vector<>();
         //vector is thread safe that is only one thread can access onne at a time 

         //while Arraylist wagera can access multiple threads a time which makes it fast 

         vector.add(34);
         vector.add(56);
         vector.add(76);
         vector.add(27);
         vector.add(89);
         System.out.println(vector);
    }
    
}
