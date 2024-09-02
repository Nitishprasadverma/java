package LinerSearch;

// import java.util.*;

public class min {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 5,2, 65, 5, 6,-8 };
        System.out.println(mins(arr));
    }

    static int mins(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
