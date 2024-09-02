import java.util.*;
public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {12,15,16,18,24,45,36,23};
int  an = ans(arr, 23);
System.out.println(an);

        
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarSearch(arr, target, start, end);
    }

    static int BinarSearch(int[] arr, int target, int start, int end){
       

        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
       
        return -1;
    }
}
