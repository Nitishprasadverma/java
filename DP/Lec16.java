package DP;

import java.util.Arrays;

public class Lec16 {
    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums) {
        int totSum = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            totSum += nums[i];
        }
        boolean dp[][] = new boolean[n][totSum + 1];

        for(int i= 0; i < n;i++){
            dp[i][0] = true;
        }

        if(nums[0] <= totSum){
            dp[0][totSum] = true;
        }

        //fill in the dp table using button-up dynamic programing approcah

        for(int ind = 1; ind <n;ind++){
            for(int tar = 1; tar <= totSum; tar++){
                boolean notTake = dp[ind - 1][tar];

                //
                boolean take = false;

                if(nums[ind] <= tar){
                    take = dp[ind - 1][tar - nums[ind]];
                }
                dp[ind][tar] = notTake || take;
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<= totSum; i++){
            if(dp[n -1][i]){
                int diff = Math.abs(i - (totSum - i));
                min = Math.min(min, diff);
            }
        }
        return min;
    }

    public int perfectSum(int[] nums, int target) {
        // code here
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
}
