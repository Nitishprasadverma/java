import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
for(int i  = 0; i < arr.length; i++){
    int last = arr.length - i -1;
    int max = getMax(arr, 0, last);
    swap(arr,max,last);
}
    }

    static void swap(int arr[], int max, int last){
        int temp =  arr[max];
        arr[max] = arr[last];
        arr[last] = temp; 
    }

    static int getMax(int arr[], int start, int end){
        int max = start;
           for(int i = start ; i <= end; i++){
           if(arr[max] < arr[i]){
            max = i;
           }
           }
           return max;
    }
}
