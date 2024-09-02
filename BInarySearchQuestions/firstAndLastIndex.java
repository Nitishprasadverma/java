// package BInarySearchQuestions;

import java.util.*;

public class firstAndLastIndex {
    public static void main(String[] args) {

        int[] arr ={1,2,2,3,5,6,6,6,6, 7,8,8,8,9};
        int[] ans = searchIndex(arr, 9);
        System.out.println(Arrays.toString(ans));
        

    }

    static int[] searchIndex(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean isStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
  return ans;
    }
}
