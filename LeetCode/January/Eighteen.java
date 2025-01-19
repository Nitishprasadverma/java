package January;

import java.util.Arrays;

public class Eighteen {

    static int[][] arr;

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    static public int uniquePaths(int m, int n) {
        arr = new int[m][n];

        for (int[] row : arr)
            Arrays.fill(row, -1);

        return solve(m, n, 0, 0);
    }

    static public int solve(int m, int n, int i, int j) {
        if (i >= m || j >= n)
            return 0;

        if (i == m - 1 && j == n - 1)
            return 1;

        if (arr[i][j] != -1)
            return arr[i][j];

        return arr[i][j] = solve(m, n, i + 1, j) + solve(m, n, i, j + 1);
    }

  static public  int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length + 1];
        for(int i = 0; i < dp.length;i++ ){
            dp[i] = -1;
        }

        return helper(height, height.length-1, dp);
    }

//Memoization
    public static int helper(int[] height, int n, int[] dp){
        if(n == 0) return 0;

        if(dp[n] != -1 ) return dp[n];
        int left = helper(height, n - 1, dp) + Math.abs(height[n] - height[n - 1]);

        int right = Integer.MAX_VALUE;

        if(n > 1) right = helper(height, n - 2, dp) + Math.abs(height[n] - height[n - 2]);

        return dp[n] = Math.min(left, right);
    }


    //Tabulation+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static public  int minCostTabulation(int[] height) {
        // code here
        int[] dp = new int[height.length + 1];
        for(int i = 0; i < dp.length;i++ ){
            dp[i] = -1;
        }

        dp[0] = 0;

        for(int i = 1; i < height.length; i++){
            int fs = dp[i - 1] + Math.abs(height[i] - height[i - 1]);

            int ss = Integer.MAX_VALUE;

            if(i > 1) ss = dp[i - 2] + Math.abs(height[i] - height[i - 2]);

            dp[i] = Math.min(fs, ss);
        }
        return dp[height.length - 1];

        
    }


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Space Optimization

    static public  int minCostTabulationSpace(int[] height) {
        // code here
       int prev = 0, prev1 =0;
       

      

        for(int i = 1; i < height.length; i++){
            int fs = prev + Math.abs(height[i] - height[i - 1]);

            int ss = Integer.MAX_VALUE;

            if(i > 1) ss = prev1 + Math.abs(height[i] - height[i - 2]);

           int curr = Math.min(fs, ss);
           prev1 = prev;
           prev = curr;
        }
        return prev;

        
    }

}
