package lectures.BinarySearch.RotatedBinarySearch;

public class Main {
    public static void main(String[] args) {
int[] arr = {7,8,9,1,2,3,4,5,6};
System.out.println(searchInRoatedArray(arr, 8));
    }

    static int searchInRoatedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            // identifying sorted half for left

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= mid) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target < arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return  -1;
    }
}
