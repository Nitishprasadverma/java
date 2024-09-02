// package LeetCode;

// import java.util.*;

public class EvenDigit1295 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 345, 938, 200, 3 };
        int ans = findNumbers(arr);
        System.out.println(ans);
        // System.out.println(countDigit(3435));
        // System.out.println(even(3779));
        System.out.println(digit(34243));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;

    }

    static boolean even(int nums) {
        int numberOfDigit = countDigit(nums);
        if (numberOfDigit % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static int countDigit(int num) {
        if(num <0){
          num = num * -1;  
        }
        if(num == 0){
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digit(int num){
        if(num <0){
            num = num * -1;  
          }

        return (int)(Math.log10(num)+1); 
        

    }
}
