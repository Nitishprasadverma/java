package DP;

import java.util.Arrays;

public class Lec18 {
     public int perfectSum(int[] nums, int target) {
     int[][] dp = new int[nums.length][target + 1];

        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, target, nums.length - 1, dp);
    }
    
 
   public int solve(int[] nums, int target, int ind, int[][] dp) {
         if (ind == 0) {
            if(target == 0 && nums[0] == 0) return 2;
            if(target ==0 || target == nums[0]) return 1;

            return 0;
            
        }
        if (dp[ind][target] != -1)
            return dp[ind][target];

        int notTake = solve(nums, target, ind - 1, dp);
        int take = 0;
        if (nums[ind] <= target) {
            take = solve(nums, target - nums[ind], ind - 1, dp);
        }
        return dp[ind][target] = notTake + take;
    }

    int countPartitions(int[] arr, int d) {
        // code here
        
        int totalSum =0;
        for(int i : arr){
            totalSum += i;
        }
        
        
        if(totalSum - d <0 || (totalSum - d) % 2 ==1 ) return 0;
        return  perfectSum(arr, (totalSum - d) / 2);
    }
}
