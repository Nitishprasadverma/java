public class MaxSub {
    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        System.out.println(maxSubArrayOptimal(nums));
    }

    static int maxSubArrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE;// maximum sum

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                int sum = 0;

                for (int k = i; i <= j; k++) {
                    sum += nums[k];
                }
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    static int maxSubArrayOptimal(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
