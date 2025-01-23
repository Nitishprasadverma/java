package DP;

import java.util.Arrays;

public class Lec8 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(m - 1, n - 1, dp);
    }

    public static int solve(int i, int j, int[][] dp) {
        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = solve(i - 1, j, dp);
        int left = solve(i, j - 1, dp);

        return dp[i][j] = up + left;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(n - 1, m - 1, dp, obstacleGrid);
    }

    static public int solve(int i, int j, int[][] dp, int[][] obstacleGrid) {
        if (i >= 0 && j >= 0 && obstacleGrid[i][j] == -1)
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        // if(i == 0 || j == 0) return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = solve(i - 1, j, dp, obstacleGrid);
        int left = solve(i, j - 1, dp, obstacleGrid);

        return dp[i][j] = up + left;
    }


    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // int  min = Integer.MIN_VALUE;
        return solvemin(n - 1, m - 1,  dp, grid);
    }
    static public int solvemin(int i, int j, int[][] dp, int[][] grid) {

        if (i == 0 && j == 0)
        return grid[i][j];
        if (i < 0 || j < 0)
        return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int up = grid[i][j] + solve(i-j, j, dp,grid);
        int left = grid[i][j] + solve(i, j - 1, dp, grid);

        return dp[i][j] = Math.min(up, left);

    }
}
