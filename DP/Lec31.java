package DP;
import java.util.Arrays;

public class Lec31 {
    public static void main(String[] args) {

    }

    public String shortestCommonSupersequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {

                if (text1.charAt(ind1 - 1) == text2.charAt(ind2 - 1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                }

                else
                    dp[ind1][ind2] =0+ Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }
        int len = dp[n][m];
        String ans = "";
        int i = n, j =m;
        int index = len - 1;
        while (i > 0 && j >0) {
            if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                ans+= text1.charAt(i - 1);
                i--;j--;
                index--;
            }
           else if(dp[i -1][j] > dp[i][j - 1]){
            ans+= text1.charAt(i - 1);
            i--;
           }else{
            ans+= text2.charAt(j - 1);
            j--;
           }
            
          
        }

        while (i > 0) {
            ans += text1.charAt(i - 1);
            i--;
        }

        while (j > 0) {
            ans += text2.charAt(j-1);
            j--;
        }

        String ans1 = new StringBuilder(ans).reverse().toString();
        return ans1;
    }

}
