import java.util.Arrays;

public class neitherMinNorMax {
   public static void main(String[] args) {
    int[] nums = {3,2,1,4};
    //2733
    System.out.println(findNonMinOrMax(nums));
   } 

   static int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        if(nums.length == 2) return -1;
        Arrays.sort(nums);
        int max = nums[n -1];
        int min = nums[0];

        for(int num : nums ){
            if(num!= max && num != min) return num;
        
       }
        return -1;
    
    }
}
