package contest;

public class SubAr {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        System.out.println(countSubarrays(nums));
    }

    static int countSubarrays(int[] nums) {
        int count = 0;
        if (nums.length < 3) {
            return 0;
        }
        for (int i = 0; i <= nums.length - 3; i++) {
            int till = 2 + i;
            if (till > nums.length) {
                break;
            }
            // int sum = 0;
            // int comp = 0;
            int num1 = 0; int num2 = 0; int num3 = 0;
            for (int j = i; j <= i; j++) {
               num1 = nums[j];
                num2 = nums[j + 1];
                num3 = nums[j + 2];

            }
           if (2 * (num1 + num3) == num2) {
                count++;
            }

        }
        return count;
            
    }
}
