import java.util.*;
public class duolicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,4};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums){

        //Time limit exceeds;
        // for(int i = 0; i  < nums.length; i++){
        //     for(int j = i + 1;j < nums.length; j++){
        //     if(nums[i] == nums[j]){
        //        return nums[i];
        //     }
        //   }
        //     }

            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == nums[i+1]) return nums[i];
            }
         return -1;
    }
}
