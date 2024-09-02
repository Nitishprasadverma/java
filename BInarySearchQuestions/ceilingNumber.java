// package BInarySearchQuestions;

import java.util.*;

public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 25, 27, 34, 37, 39 };
        int ans = ceilingOfaNumber(arr, 38);
        System.out.println(ans);
    }

    static int ceilingOfaNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }
        while (start <= end) {
            // int middle = (start + end) / 2;
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }

        }
        return arr[start];

    }

}
