import java.util.*;
public class twoSumMedium {
   public static void main(String[] args) {
    int arr[] = {2,3,4};
    int target = 6;
    int []ans = twoSum(arr, target);
    System.out.println(Arrays.toString(ans));
   } 

   static int[] twoSum(int[] nums, int target){
    int sum = 0;
    for(int i = 0; i  < nums.length; i++){
        int j =0;
       sum = nums[i]+ nums[j + 1];
       j++;
       System.out.println(j);
      if(target == sum){
        return new int[]{i,j};
        
      }
    }
   return new int[]{};
}
}
