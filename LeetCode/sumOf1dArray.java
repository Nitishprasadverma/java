import java.util.*;
public class sumOf1dArray {
    public static void main(String[] args) {
        int arr[] = {3,1,2,10,1};
        int[] ans = sum(arr);
System.out.println(Arrays.toString(ans));
    }

    static int[] sum(int arr[]){
        int sum = 0;
        int[] newarr = new int[arr.length];
        for(int i =0; i < arr.length; i++){
           
            sum += arr[i];
            newarr[i] = sum;
        }
        return newarr;
    }
}
