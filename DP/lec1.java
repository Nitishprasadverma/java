
package DP;

import java.util.Arrays;

public class lec1 {
    public static void main(String[] args) {
        int n = 5;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // System.out.println(plaindromeMemo(n, dp));


        // tabulation

        int j = 5;
        int[] dp1 = new int [j + 1];
        Arrays.fill(dp1, -1);
      
        int ans = plaindromeTabulation(n, dp1);
        System.out.println(ans);
    }

    // memoization
    static int plaindromeMemo(int n, int[] dp) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];
        return dp[n] = plaindromeMemo(n - 1, dp) + plaindromeMemo(n - 2, dp);

    }

    // tabulation

    static int plaindromeTabulation(int n, int[] dp) {
        dp[0] =  0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
