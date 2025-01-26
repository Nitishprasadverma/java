package DP;

import java.util.Arrays;

public class Lec13 {
    public static void main(String[] args) {

    }

    public int solve(int n, int m, int grid[][]) {
        // Code here

        int[][][] dp = new int[n][m][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return f(0, 0, m-1, grid, dp);
    }

    public int f(int i, int j1, int j2, int[][] grid, int[][][] dp) {
        if (j1 < 0 || j1 >= grid[0].length || j2 < 0 || j2 >= grid[0].length)
            return (int) (Math.pow(-10, 9));

        if (i == grid.length - 1) {
            if (j1 == j2)
                return grid[i][j1];
            else {
                return grid[i][j1] + grid[i][j2];
            }
        }

        if (dp[i][j1][j2] != -1)
            return dp[i][j1][j2];
        // explore all paths of of both robot simultaneously

        int max = Integer.MIN_VALUE;

        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <= 1; dj2++) {
                int value =0;
                if (j1 == j2) {

                    value = grid[i][j1] + f(i + 1, j1 + dj1, j2 + dj2, grid, dp);
                } else {
                    value = grid[i][j1] + grid[i][j2] + f(i + 1, j1 + dj1, j2 + dj2, grid, dp);
                }

                max = Math.max(max, value);
            }

        }

        return dp[i][j1][j2] = max;
    }


    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int dp[][] = new int[arr.length][target + 1];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }

        return helper(arr.length - 1, target, arr, dp);
    }

    static boolean helper(int i,int target, int[] arr, int[][] dp){
        if(target == 0) return true;

        if(i == 0) return arr[0] == target;

        if(dp[i][target] != -1) return dp[i][target] == 0? false : true;

        boolean notTake = helper(i - 1, target, arr, dp);

        boolean take = false;
        if(arr[i] <= target){
            take = helper(i - 1, target - arr[i], arr, dp);
        }


        dp[i][target] = notTake || take ? 1:0;
        return notTake || take;
    }


    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length;i++ ){
            totalSum += nums[i];
        }

        if(totalSum % 2 != 0) return false; 
        int target = totalSum / 2;

        int dp[][] = new int[nums.length][target + 1];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        return (helper(nums.length - 1, target, nums, dp)) ;

    }


}
