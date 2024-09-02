import java.util.*;

public class maxItem {
    public static void main(String[] args) {
        int[] arr = { 4, 54, 6, 78, 89, 3,  790, 600 };

        // int ans = maxIte(arr);
        // System.out.println(ans);

        // int rangeMax = maxRange(arr, 2, 6);
        // System.out.println(rangeMax);

        reverse(arr);
        System.out.println(Arrays.toString(arr));
      
    }

    static int maxIte(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            // if(max>arr[i]){

            // }
            // else{
            // max = arr[i];
            // }

        }
        return max;

    }

    static int maxRange(int[] arr, int startIndex, int endIndex) {
        int max = arr[startIndex];
        if (startIndex > endIndex) {
            return -1;

        } else {

            for (int i = startIndex; i <= endIndex; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        return max;
    }
   

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}

