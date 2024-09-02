import java.util.*;
public class permutation {
    public static void main(String[] args) {
        int arr[] = {0,2,1,5,3,4};
       
        int num = arr[arr[1]];
        System.out.println(num);
        int[] ans  = buildArray(arr);
        System.out.println(Arrays.toString(ans));

    }
   static int[] buildArray( int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = nums[nums[i]];

        return ans;
    }
}
