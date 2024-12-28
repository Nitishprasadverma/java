import java.util.ArrayList;
import java.util.List;

public class mjaority2 {
   public static void main(String[] args) {
   

   } 
static List<Integer>majorityElement(int[] nums){
    int n = nums.length;
     List<Integer> res = new ArrayList<>();  // this is correct still giving error cannot resolve to variable 
    for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] == nums[i]){
                count++;
            }
        }
        if(count > n /3 && (!res.contains(nums[i]))) res.add(nums[i]);
    }
    return res;
 }

}
