public class maxCosuthree {
    public static void main(String[] args) {
        int []  nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes1(nums, k));
    }


    //Brute force apprach
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for(int i  = 0; i < nums.length; i++){
            int zeros = 0;
            for(int j = i; j < nums.length;j++){
                if(nums[j] == 0) zeros++;

                if(zeros <= k){
                    int len  = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }


    //better  using sliding window;
    public static int longestOnes1(int nums[], int k){
        int i = 0, j =0,maxlen = 0;
        int n  = nums.length;
        int zeros = 0;
        while (j < n ) {
            if(nums[j] == 0) zeros++;

            while (zeros > k) {
                if(nums[i] == 0){
                    zeros--;
                    
                }
                i++;
            }
            if(zeros <=k){
                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }

    //optimal

    public static int longestOnes2(int nums[], int k){
        int i = 0, j =0,maxlen = 0;
        int n  = nums.length;
        int zeros = 0;
        while (j < n ) {
            if(nums[j] == 0) zeros++;

            if (zeros > k) {
                if(nums[i] == 0){
                    zeros--;
                }
                i++;
            }
            if(zeros <=k){
                int len = j - i + 1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}
