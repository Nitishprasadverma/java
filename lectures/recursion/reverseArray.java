package recursion;
import java.util.*;;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        swapArray(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {2,34,4,5,6};
        swapArraySinglePointer(arr1,  0 );
        System.out.println(Arrays.toString(arr1));
    }

    //using two pointer
    static void swapArray(int[] arr, int left , int right){
        
       if(left > right) return;

      swap(arr, left, right);
        swapArray(arr, left + 1, right - 1);
    }

    //using single pointer

    static void swapArraySinglePointer(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2) return;

       int temp = arr[i];
       arr[i] = arr[n - 1 - i];
       arr[n - 1 - i] = temp;
       swapArraySinglePointer(arr, i + 1);
    }
    static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
