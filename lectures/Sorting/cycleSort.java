import java.util.*;
public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[], int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
