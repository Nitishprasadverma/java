import java.util.*;
public class squareSorted {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = square(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] square(int[] nums){
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length;  i++){
            newArr[i] = nums[i] * nums[i];
        } 
        Arrays.sort(newArr);

        return newArr;
    }
}
