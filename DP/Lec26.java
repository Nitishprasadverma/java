package DP;

import java.util.Arrays;

public class Lec26 {

    // geeksForgeeks
    public int longestCommonSubstr(String text1, String text2) {
        // code here

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }
        int ans = 0;
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {

                if (text1.charAt(ind1 - 1) == text2.charAt(ind2 - 1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                    ans = Math.max(dp[ind1][ind2], ans);
                }

                else
                    dp[ind1][ind2] = 0;
            }
        }
        return ans;
    }

    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();

        return longestCommonSubstr(s, s2);

    }

    public int longestCommonSubSequence(String text1, String text2) {
        // code here

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];
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

                if (text1.charAt(ind1 - 1) == text2.charAt(ind2 - 1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                }

                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }
        return dp[n][m];
    }


    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
     int longestSubseq =    longestCommonSubSeq(word1,word2);
     int delReqInWord1 = n - longestSubseq;
     int delReqInWord2 = m - longestSubseq;
     return delReqInWord1 + delReqInWord2;
    }

    public int longestCommonSubSeq(String text1, String text2) {
        // code here
        
           int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
       
            for(int j = 0;j <=m; j++){
                dp[0][j] = 0;
            }
            for(int i =1; i<= n; i++){
                dp[i][0] =0;
        }

        for(int ind1 = 1; ind1 <=n;ind1++){
            for(int ind2 = 1; ind2 <=m ; ind2++){

                if(text1.charAt(ind1-1) == text2.charAt(ind2-1)){
                    dp[ind1][ind2] = 1 + dp[ind1 - 1] [ind2 - 1]; 
                }
        
              else  dp[ind1][ind2] = Math.max(dp[ind1 - 1] [ind2] , dp[ind1] [ind2 - 1]);
            }
        }
        return dp[n][m];
    }

    public int minInsertions(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int longestPalinLen = longestCommonSubstr(s,s2);
        int length = s.length();
       //  int n = palindrome.length();
        return length -longestPalinLen ;
   }

    public int longestCommonSubseq(String text1, String text2) {
       // code here
       
          int n = text1.length();
       int m = text2.length();

       int[][] dp = new int[n + 1][m+1];
       for(int[] row : dp){
           Arrays.fill(row, -1);
       }
      
           for(int j = 0;j <=m; j++){
               dp[0][j] = 0;
           }
           for(int i =1; i<= n; i++){
               dp[i][0] =0;
       }

       for(int ind1 = 1; ind1 <=n;ind1++){
           for(int ind2 = 1; ind2 <=m ; ind2++){

               if(text1.charAt(ind1-1) == text2.charAt(ind2-1)){
                   dp[ind1][ind2] = 1 + dp[ind1 - 1] [ind2 - 1]; 
               }
       
             else  dp[ind1][ind2] = Math.max(dp[ind1 - 1] [ind2] , dp[ind1] [ind2 - 1]);
           }
       }
       return dp[n][m];
   }
}
