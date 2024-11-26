import java.util.Arrays;

public class thirdDist {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        System.out.println(arr);
    }

    static int thirdMax(int[] nums) {
        int n = nums.length;
        int cnt = 1;
        Arrays.sort(nums);
        for(int i  = n-1; i > 0;i--){
            if(nums[i] != nums[i - 1]) cnt++;
            if(cnt == 3) return nums[i - 1];

        }
        return nums[n -1];
    }
}
