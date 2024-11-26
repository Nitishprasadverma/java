public class largest747 {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }

    static int dominantIndex(int[] nums) {
        int max = 0;
        int n = nums.length;
        int index = 0;
        for(int i =0; i < n ;i++){
         if(nums[i] > max){
             max = nums[i];
             index = i;
         }
        }
 
        for(int i = 0; i < n; i++){
         if(i != index && max <2 * nums[i]){
            return -1;
         }
        }
 
        
        return index;
     }
}
