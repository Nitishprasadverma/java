public class countNumOfNiceSubArr {
    public static void main(String[] args) {
        
    }

    public int numSubarraysWithSum(int[] nums, int goal){
        int cnt1 = numSubarraysWithSumHelper(nums, goal);
        int  cnt2 = numSubarraysWithSumHelper(nums, goal -1);
        return cnt2 - cnt1;
    }
    public int numSubarraysWithSumHelper(int[] nums, int goal) {
        if(goal < 0) return 0;
        int l = 0, r =0, sum = 0, cnt  = 0;

        while (r <= nums.length) {
            sum += nums[r] % 2;
            while (sum > goal) {
                sum = sum - nums[l] % 2;
                l++;
            }
            cnt =cnt + (r -l + 1);
            r++;
        }
        return  cnt;
    }

}
