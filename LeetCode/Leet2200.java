import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/description/?envType=daily-question&envId=2025-06-24
public class Leet2200 {
     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
         
        // for(int i = 0; i < nums.length; i++){
        //     for(int j  = 0; j < nums.length ; j++){
        //         if(nums[j] == key && Math.abs(i - j) <=k){
        //             result.add(i);
        //               break;
        //         }
              
        //     }
        // }

        // return result;


        // HashSet<Integer> set = new HashSet<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == key){
                int startIndex = Math.max(j - k, 0);
                int endIndex = Math.min(j + k, nums.length - 1);
                 if(!result.isEmpty() && result.get(result.size() - 1) >= startIndex){
                    startIndex = result.get(result.size() - 1) + 1;
                 }
                for(int i = startIndex; i <= endIndex; i++) result.add(i);
            }

        }
     
        return result;
    }
}
