// import java.util.*;
public class keepingValue {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
System.out.println(findFinalValue(arr, 3));
    }

    static int findFinalValue(int[] nums, int original){
        int ans = original;
        for(int i = 0; i < nums.length; i++ ){
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == ans){
                    ans = 2 * ans;
                }
            }
            
        }
        return ans;
    }
}
