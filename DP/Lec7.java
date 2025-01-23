package DP;

import java.util.Arrays;

public class Lec7 {
    public static void main(String[] args) {
        
    }
   static public int maximumPoints(int arr[][]) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][4];
        
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
       return helper(n - 1, 3, arr, dp);
    }

    static public int helper(int day, int last, int[][]points, int[][]dp){


        if(dp[day][last] != -1) return dp[day][last];
        if(day == 0){
            int max = 0;
            for(int i = 0; i <= 2; i++){
                if(i != last){
                    max = Math.max(max, points[0][i]);
                }
            }
            return dp[day][last] = max;
        }

       

        int max = 0;
        for(int i = 0;  i <= 2; i++){
            if(i != last){
                int point = points[day][i] + helper(day - 1, i, points, dp);
                max = Math.max(max, point);
            }
        }

        return dp[day][last] = max;
    }

}
