import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {
                23, 4, 6, 7, 8
        };
        swap(arr, 2, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
