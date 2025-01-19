package January;

import java.util.Arrays;

public class Nint {
    static int[] dx = { -1, 0, 0, 1 };
    static int[] dy = { 0, -1, 1, 0 };

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 6, 0 }, { 5, 7, 8 }, { 0, 9, 0 }
        };

        System.out.println(getMaximumGold(grid));
    }

    static public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0)
                    ans = Math.max(ans, helper(grid, i, j));
            }
        }
        return ans;
    }

    public static int helper(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0)
            return 0;

        int maxSum = 0, curVal = grid[i][j];

        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d], nj = j + dy[d];
            grid[i][j] = 0;
            maxSum = Math.max(maxSum, curVal + helper(grid, ni, nj));
            grid[i][j] = curVal;
        }

        return maxSum;
    }

    // memoization
    public int minimizeCost(int k, int arr[]) {
        // code here

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solve(arr, k, dp, arr.length - 1);
    }

    static public int solve(int[] arr, int k, int[] dp, int ind) {
        if (ind == 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int mnSetps = Integer.MAX_VALUE;

        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jump = solve(arr, k, dp, ind - i) + Math.abs(arr[ind] - arr[ind - i]);
                mnSetps = Math.min(mnSetps, jump);
            }
        }
        return dp[ind] = mnSetps;
    }

    // Tabulation

    public int minimizeCostTabu(int k, int arr[]) {
        // code here

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solveTabu(arr.length, arr, k, dp);
    }

    static public int solveTabu(int n, int[] arr, int k, int[] dp) {

        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mmSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);

                    mmSteps = Math.min(jump, mmSteps);
                }
            }

            dp[i] = mmSteps;
        }
        return dp[n - 1];
    }

    //using Memoization DP
    static public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robhelper(nums.length - 1, nums, dp);
    }

    static public int robhelper(int ind, int[] nums, int[] dp) {
        if (ind == 0)
            return nums[ind];
        if (ind < 0)
            return 0;
        if (dp[ind] != -1)
            return dp[ind];

        int rob = nums[ind] + robhelper(ind - 2, nums, dp);

        int notRob = 0 + robhelper(ind - 1, nums, dp);

       return dp[ind] = Math.max(rob, notRob);

       
    }


    static public int robTabulation(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robhelper(nums.length -1, nums, dp);
    }

    static public int solveTabulationRob(int n, int[] nums, int[] dp){
        dp[0] =0;
        // int neg = 0;
        for(int i = 1; i < nums.length; i++){
            int rob = nums[i]; 
            if(i > 1){
                rob +=  dp[i - 2];
            } 

            int notRob =  dp[i - 1];

            dp[i] = Math.max(rob, notRob);
        } 

        return dp[n-1];
    }

}
