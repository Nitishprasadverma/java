public class maxConse1 {
   public static void main(String[] args) {
    int[] nums = {1,1,0,1,1,1};
    findMaxConsecutiveOnes(nums);
   } 

   static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
         
            if(nums[i] == 1){
                count++;
            }else{
                if(count > ans){
                    ans =count;
                }
                count = 0;
            }
        }
        return Math.max(ans, count);
   }
}
