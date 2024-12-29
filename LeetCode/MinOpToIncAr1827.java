public class MinOpToIncAr1827 {
    public static void main(String[] args) {
        int [] nums = {1,5,2,4,1};
        System.out.println(minOperations(nums));
    }

   static int minOperations(int[] nums) {
        
    // int opn = 0;
    // for(int i = 0; i < nums.length - 1; i++){
    //     if(nums[i + 1] > nums[i]) continue;

    // while(nums[i + 1] <= nums[i]){
    //     nums[i + 1] = nums[i + 1]+1;
    //     opn++;
    // }
    // }
    // return opn;

    int cnt = 0;

    for(int i = 0 ; i < nums.length -1; i++){
        if(nums[i + 1] > nums[i]) continue;

        if(nums[i + 1] < nums[i]){
            int diff = nums[i] - nums[i + 1] + 1;

            nums[i + 1] += diff;
            cnt+=diff;
        }
    }
    return cnt;
    }
}
