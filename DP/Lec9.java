package DP;

import java.util.Arrays;

public class Lec9 {
    public static void main(String[] args) {

    }

    // memoization
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = solve(n - 1, coins, amount, dp);

        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }

    public int solve(int ind, int coins[], int amount, int[][] dp) {
        if (ind == 0) {
            if (amount % coins[0] == 0)
                return amount / coins[0];
            else
                return (int) Math.pow(10, 9);
        }

        if (dp[ind][amount] != -1)
            return dp[ind][amount];
        int notTake = 0 + solve(ind - 1, coins, amount, dp);
        // int min = Integer.MAX_VALUE;
        int take = (int) Math.pow(10, 9);
        if (coins[ind] <= amount) {
            take = 1 + solve(ind, coins, amount - coins[ind], dp);
        }
        return dp[ind][amount] = Math.min(take, notTake);
    }

    public int coinChangeTabul(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int T = 0; T <= amount; T++) {
            if (T % coins[0] == 0)
                dp[0][T] = T / coins[0];
            else
                dp[0][T] = (int) Math.pow(10, 9);
        }

        for (int ind = 1; ind < n; ind++) {
            for (int t = 0; t <= amount; t++) {
                int notTake = 0 + dp[ind - 1][t];
                // int min = Integer.MAX_VALUE;
                int take = (int) Math.pow(10, 9);
                if (coins[ind] <= t) {
                    take = 1 + dp[ind][t - coins[ind]];
                }
                dp[ind][t] = Math.min(take, notTake);
            }
        }

        int ans = dp[n - 1][amount];
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int totSum = 0;
        int n = nums.length;
        // Calculate the total sum of elements in the array
        for (int i = 0; i < n; i++) {
            totSum += nums[i];
        }

        // Checking for edge cases
        if (totSum - target < 0 || (totSum - target) % 2 == 1)
            return 0;

        return findWays(nums, (totSum - target) / 2);

    }

    static int mod = (int) (Math.pow(10, 9) + 7);

    // Function to find the number of ways to achieve the target sum
    static int findWays(int[] num, int tar) {
        int n = num.length;

        // Create a 2D array to store results of subproblems
        int[][] dp = new int[n][tar + 1];

        // Initialize the dp array for the first element of the array
        if (num[0] == 0)
            dp[0][0] = 2; // 2 cases - pick and not pick
        else
            dp[0][0] = 1; // 1 case - not pick

        if (num[0] != 0 && num[0] <= tar)
            dp[0][num[0]] = 1; // 1 case - pick

        // Fill the dp array using dynamic programming
        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= tar; target++) {
                int notTaken = dp[ind - 1][target];

                int taken = 0;
                if (num[ind] <= target)
                    taken = dp[ind - 1][target - num[ind]];

                dp[ind][target] = (notTaken + taken) % mod;
            }
        }

        return dp[n - 1][tar];
    }

}
