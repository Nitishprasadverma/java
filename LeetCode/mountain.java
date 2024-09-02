// import java.util.*;
public class mountain{
    public static void main(String[] args) {
        int[]  arr = {12,13,14,15,36,33,32,30,20};
        System.out.println(mountainAarray(arr));
    }

    static int mountainAarray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid +  1]){
             end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}