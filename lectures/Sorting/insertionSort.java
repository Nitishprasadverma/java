import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
int[] arr = {};
insertion(arr);
System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int arr[], int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
