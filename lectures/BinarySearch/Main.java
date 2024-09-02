// package BinarySearch;

// import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = { 5 };
        int ans = binarSearch(arr, -5);
        System.out.println(ans);
    }

    static int binarSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int middle = (start + end) / 2;
            int middle = start + (end - start)/2;
            if (arr[middle] == target) {
                return middle;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else{
                return -1;
            }
        }
        return -1;

    }

}
