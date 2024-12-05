import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNum3 {
   public static void main(String[] args) {
    int[] arr = {1,2,1,3,2,5};
    int[] ans = singleNumber(arr);
    System.out.println(Arrays.toString(ans));
   } 

   static int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
int i = 0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int element = entry.getKey();
            int fre = entry.getValue();
            if(fre == 1){
                ans[i++] =element;
            }
        }
        return ans;
   }
}
