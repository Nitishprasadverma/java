// import java.util.*;
public class parity {
    public static void main(String[] args) {
        int[] arr = {
            3,1,2,4
        };
        int[] ans = sortArrayByParity(arr);
        System.out.println(ans.toString());
    }
static int[] sortArrayByParity(int[] nums){
    int last = nums.length -1;
    int[] newArr = new int[nums.length];
    int start = 0;
    int i = 0;
    while( i < nums.length){
        if(nums[i] % 2 == 0){
            newArr[start] = nums[i];
           
        }
        else{
            newArr[last] = nums[i];
            last--;
            
        }
        i++;
    }
    return newArr;
}
}
