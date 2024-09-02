import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); // syntax of Dyanmic array (43) //size is optional

        // list.add(32);
        // list.add(43);
        // list.add(67);
        // list.add(98);
        // list.add(32);
        // list.add(43);
        // list.add(67);
        // list.add(98);
        // list.add(32);
        // list.add(43);
        // list.add(67);
        // list.add(98);
        // list.add(32);
        // list.add(43);
        // list.add(67);
        // list.add(98);


        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) +" ");

        }
        
        System.out.println(list);
        in.close();
    }
}
