// import java.util.*;

public class findMoutainArray {
    public static void main(String[] args) {
int[] arr = {0,1,2,4,2,1};
int ans = search(arr, 1);
System.out.println(ans);
    }

    static int search(int[] arr, int target) {

        int peak = mountainArray(arr);
        int firstTry = orderIgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // searching in second half;
        return orderIgnostic(arr, target, peak + 1, arr.length - 1);

    }

    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderIgnostic(int[] arr, int target, int start, int end) {

        boolean isAce = arr[start] < arr[end];

        while (start <= end) {
            // int middle = (start + end) / 2;
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            }

            if (isAce) {
                if (target > arr[middle]) {
                    start = middle + 1;
                }
                // if (target < arr[middle])
                else {
                    end = middle - 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                }
                // else if{ (target < arr[middle])
                else {
                    start = middle + 1;
                }
            }
        }

        return -1;
    }
}
