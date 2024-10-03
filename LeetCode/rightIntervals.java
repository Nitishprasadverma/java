//leetcode 436


import java.util.*;

public class rightIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
            {3,4},
            {2,3},
            {1,2}
        };
       int[] ans  = findRightInterval(intervals);
       System.out.println(Arrays.toString(ans));
    }

    static int[] findRightInterval(int[][] intervals) {

        // length of the intervals array

        int n = intervals.length;

        // creating a new 2D array with one extra index which stores the orginal index
        // value for each intervals

        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals[i][0]; // start
            arr[i][1] = intervals[i][1]; // end
            arr[i][2] = i; // orginal index of each intervals
        }

        // sorting the indexed intervals based on the starting time

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // creating new 1-D array to store the ans

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            ans[arr[i][2]] = binarySearch(arr, i, n - 1, arr[i][1]);
        }
        return ans;
    }

    static int binarySearch(int[][] arr, int low, int high, int target) {
        // initializing the result with -1 if not found then return with -1

        int result = -1;

        while (low <= high) {

            // calulating mid
            int mid = low + (high - low) / 2;

            // if found then that index will be asign to result and continue searching in
            // rest part too
            if (arr[mid][0] >= target) {
                result = arr[mid][2];
                high = mid - 1;
            }
            // moving towrds bigger element side by increasing low
            else {
                low = mid + 1;
            }
        }
        return result;
    }
}
