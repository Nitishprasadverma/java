package CollectionFrameWorks;
import  java.util.*;


public class Lec1Main {

    public static void main(String[] args) {
    //     List<Integer> values = new ArrayList<>();

    // values.add(1);
    // values.add(2);
    // values.add(3);
    // values.add(4);

    // //using iterator
    // System.out.println("Iterating the values using iterator method");

    // Iterator<Integer> valuesIterator = values.iterator();

    // while (valuesIterator.hasNext()) {
        
    //     int val = valuesIterator.next();
    //     System.out.println(val);
    //     if(val == 3){
    //         valuesIterator.remove();
    //     }

    // }

    // System.out.println("Iterating the values using for each loop:");

    // for(int val : values){
    //     System.out.println(val);
    // }

    // //using forEach Method

    // System.out.println("Testing forEach method");

    // values.forEach( (Integer val) -> System.out.println(val));
    // }
    

     List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // using iterator
        System.out.println("Iterating the values using iterator method");
        Iterator<Integer> valuesIterator = values.iterator();

        while (valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println(val);

            if (val == 3) {
                valuesIterator.remove();
            }
        }

        System.out.println("Iterating the values using for-each loop");
        for (int val : values) {
            System.out.println(val);
        }

        // using forEach method
        System.out.println("testing forEach method");
        values.forEach((Integer val) -> System.out.println(val));


           List<Integer> values1 = new ArrayList<>();
        values1.add(1);
        values1.add(4);
        values1.add(2);
        values1.add(4);

        System.out.println("max value:" + Collections.max(values1));
        System.out.println("min value:" + Collections.min(values1));

        Collections.sort(values1);

        System.out.println("sorted");
        values1.forEach((Integer val) -> System.out.println(val));

    }
}
