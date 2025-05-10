package OOP.Generics;

import java.util.Arrays;

public class WildcardExample<T extends Number> {
 private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
       data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T remove = (T)(data[--size]);
        return remove;
    }

    public T get(int index) {
        return (T)(data[index]);

    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +", size=" + size + '}';
    }



   public static void main(String[] args) {
    WildcardExample list = new WildcardExample<>();

    list.add(3);
    list.add(45);
    list.add(4);

    for(int i = 0; i < 12;i++){
        list.add(2*i);
    }
    System.out.println(list);

    WildcardExample<Integer> list2 = new WildcardExample<>();
    for(int i = 0; i < 14; i++){
        list2.add(2 * i);

    }

    System.out.println(list2);
   } 
}
