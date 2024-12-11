import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6,7,8};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0){
            return;
        } 
        
        k = k % n;
        // if(k > n)
        int[] tempArr = new int[k];
        for(int i = n - k; i <n; i++){
            tempArr[i - n + k] = nums[i];
        } 

        for(int i = n - k -1; i >= 0; i--){
            nums[i + k] = nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[i] = tempArr[i];

        }
}

}
