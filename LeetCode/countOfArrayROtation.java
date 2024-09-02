// import java.util.Arrays;

public class countOfArrayROtation {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5};
       System.out.println(countRotations(arr));
        
    }

    static int countRotations(int[] arr){
      int  pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) { //mid < end means mid index must be less than the lasst index of the array otherwise index would be outofbound error ,in case when mid will be last index already and mid + 1 will give ArrayindexOutOfBound.
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {  // simliarly mid must be greater than the start bcz mid should be greater than 0 index na.
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
