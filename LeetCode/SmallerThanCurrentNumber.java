import java.util.*;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7 };
        int[] ans = NumSmallerThanCurrentNumber(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] NumSmallerThanCurrentNumber(int[] arr) {
        int[] newArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    sum++;
                }

            }
            newArr[i] = sum;
            sum = 0;
        }
        return newArr;
    }
}
