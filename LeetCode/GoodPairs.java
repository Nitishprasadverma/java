// import java.util.*;
public class GoodPairs {
   public static void main(String[] args) {
    int[] nums = {1,2,3,1,1,3};
    System.out.println(goodPairs(nums));
   } 
   static int goodPairs(int[] nums){
    int num = 0;
    for(int i = 0; i < nums.length; i++){
        for(int j = 1; j < nums.length; j++ ){
              if((nums[i] == nums[j]) && (i < j)){
                num++;
                System.out.println(num);
              }
        }
    }
    return num;
   }
   
}
