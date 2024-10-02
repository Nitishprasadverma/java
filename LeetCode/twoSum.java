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



    /*
     * 
     * using hashmap
     * 
     * 
     * 
       int n = nums.length;
       Map<Integer, Integer> map = new HashMap<>();
       int[] result = new int[2];

       for(int  i = 0; i < n; i++){
        if(map.containsKey(target - nums[i])){
            // result[1] = i;
            // result[0] = map.get(target- nums[i]);
            return new int[]{map.get(target - nums[i]), i};
          
        }
        map.put(nums[i], i);
       }
        return new int[]{};
     */
}
    
}