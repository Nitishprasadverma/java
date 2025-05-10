// package lectures;

import java.util.HashSet;
import java.util.Set;

public class min3375 {
     public int minOperations(int[] nums, int k) {
        //base case!
    //   int  min = minimum(nums);
    //     if(min < k) return -1;
        
    //      Set<Integer> uniqueNums = new HashSet<>();
    //     for (int num : nums) {
    //         uniqueNums.add(num);
    //     }

    //     List<Integer> sortedValues = new ArrayList<>(uniqueNums);
    //     sortedValues.sort(Collections.reverseOrder());

    //     int op = 0;
    //     int curr = sortedValues.get(0);

    //     for(int h : sortedValues){
    //         if(h < curr){
    //             op++;
    //             curr = h;

    //         }
    //     }
    //     //checking if all elements of array didn't reach equal to k, will be one more op with k else op
    //     if(curr != k){
    //         return op+1;
    //     }else if(curr == k){
    //         return op;
    //     }
    //     return -1;
 Set<Integer> uniqueNums = new HashSet<>();

 for(int num : nums){
    if(num < k) return -1;
    else if(num > k) uniqueNums.add(num);
 }

return uniqueNums.size();
    }

     public int minimum(int[] nums){
       int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}
