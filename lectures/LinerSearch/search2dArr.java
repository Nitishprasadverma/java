package LinerSearch;

import java.util.*;

public class search2dArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 12, 34, 28, 18, 3, 23 },
                { 99, 55, 67, 33, 23 },
                { 2, 5, 7, 89, },
                { 9, 23, 43, 27, 28 ,100}

        };
        int target = 78;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int max = max(arr);
        System.out.println(max);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
