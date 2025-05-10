package LeetCode;

public class EigthMay {
    

    class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum  = 0;
            int n = arr.length;
            for(int i = 0; i < n; i++){
                int left = i + 1;
                int ryt = n - i;
                int totalSubArr = left * ryt;
                int oddLengt = (totalSubArr + 1 ) / 2;
                sum += arr[i] * oddLengt;
            }
            return sum;
        }
    }

    class Solution2 {
        public int sumOfSquares(int[] nums) {
            int sum = 0;
            int n = nums.length;
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    sum += nums[i - 1] * nums[i - 1];
                }
            }
            return sum;
        }
    }
}
