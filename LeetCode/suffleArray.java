import java.util.*;

public class suffleArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        int[] ans = SuffleArrays(arr, 4);
        System.out.println(Arrays.toString(ans));

    }

    static int[] SuffleArrays(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int j = 0;

        for (int i = 0; i < 4; i++) {
            arr[j++] = nums[i];
            arr[j++] = nums[n + i];

        }
        return arr;
    }
}