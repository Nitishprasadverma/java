import java.util.*;

public class addTOArray {
    public static void main(String[] args) {
        int[] arr = {9,8,6};
        System.out.println(addToArrayFrom(arr, 1));
        // addToArrayFrom(arr, 0);
    }

    static List<Integer> addToArrayFrom(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = k;

        // Process the number from the last digit to the first digit
        for (int i = n - 1; i >= 0; i--) {
            carry += num[i];
            // System.out.println(carry);
            result.add(carry % 10);
            // System.out.println(result);
            carry /= 10;
            
        }
    //    System.out.println(result);
        // If there is any carry left
        while (carry > 0) {
            result.add(carry % 10);
          
            carry /= 10;
        }

        // Reverse the result list to get the correct order
        Collections.reverse(result);
        return result;
        
        // List<Long> ans = new ArrayList<>();
        // long  num = 0;
        // System.out.println(num);
        
        // for (int i : nums) {
        //     num = num * 10;
        //     num = num + i;
        // }

        // System.out.println(num);
        // num += k;
        // while (num > 0) {
        //     long digit = num % 10;
        //     ans.add(digit);
        //     num = num / 10;
        // }
        
        // return ans;
        // List<Integer> ans = new ArrayList<>();
        // int nums = 0;
        
        // for (int i : num) {
        //     nums = nums * 10;
        //     nums = nums + i;
        //     System.out.println(nums);
        // }
        
        // // System.out.println(num);
        // nums += k;
        // System.out.println(nums);
        // while (nums > 0) {
        //     int digit = nums % 10;
        //     ans.add(digit);
        //     nums = nums / 10;
        // }

        // return ans.reversed(); 
    }

}
