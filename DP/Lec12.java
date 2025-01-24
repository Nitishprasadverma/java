package DP;

import java.util.Arrays;

public class Lec12 {
    public static void main(String[] args) {

    }

    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < matrix[0].length; j++) {
            int ans = solve(matrix, matrix.length - 1, j, dp);

            max = Math.max(max, ans);
        }
        return max;

    }

    public int solve(int[][] matrix, int i, int j, int[][] dp) {

        if (j < 0 || j >= matrix[0].length)
            return (int) Math.pow(-10, 9);

        if (i == 0)
            return matrix[0][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = matrix[i][j] + solve(matrix, i - 1, j, dp);
        int leftDig = matrix[i][j] + solve(matrix, i - 1, j - 1, dp);

        int rightDig = matrix[i][j] + solve(matrix, i - 1, j + 1, dp);
        return dp[i][j] = Math.max(up, Math.max(leftDig, rightDig));
    }

    // Tabulation
    public int minFallingPathSumTabu(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i][j] + dp[i - 1][j];

                int leftDig = matrix[i][j];

                if (j - 1 >= 0) {
                    leftDig += dp[i - 1][j - 1];
                } else {
                    leftDig += (int) Math.pow(10, 9);
                }

                int rightDig = matrix[i][j];
                if (j + 1 < m) {
                    rightDig += dp[i - 1][j + 1];
                } else {
                    rightDig += (int) Math.pow(10, 9);
                }

                dp[i][j] = Math.min(up, Math.min(leftDig, rightDig));
            }

        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }

        return min;
    }
}
