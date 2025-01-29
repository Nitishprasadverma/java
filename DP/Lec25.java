package DP;

import java.util.Arrays;

public class Lec25 {

    //tabulation
    public int longestCommonSubsequenceTabu(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(n - 1, m - 1, text1, text2, dp);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {

                if (text1.charAt(ind1-1) == text2.charAt(ind2-1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                }

                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m];
    }

    public int solve(int ind1, int ind2, String str1, String str2, int[][] dp) {
        if (ind1 < 0 || ind2 < 0)
            return 0;

        if (dp[ind1][ind2] != -1)
            return dp[ind1][ind2];
        if (str1.charAt(ind1) == str2.charAt(ind2)) {
            return dp[ind1][ind2] = 1 + solve(ind1 - 1, ind2 - 1, str1, str2, dp);
        }

        return dp[ind1][ind2] = Math.max(solve(ind1 - 1, ind2, str1, str2, dp), solve(ind1, ind2 - 2, str1, str2, dp));
    }
}
