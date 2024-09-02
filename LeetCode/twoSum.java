import java.util.*;

public class twoSum {
public static void main(String[] args) {
    int arr[] = {2,3,4};
    int target = 6;
    int []ans = twoSums(arr, target);
    System.out.println(Arrays.toString(ans));
}
static int[] twoSums(int[] nums, int target){
    for(int i = 0; i  < nums.length; i++){
        for(int j = i + 1;j < nums.length; j++){
         if(target ==  nums[i]+ nums[j]){
        return new int[]{i,j};
      }
        }
    }
    return new int[]{};
}
    
}