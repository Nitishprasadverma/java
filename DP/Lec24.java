package DP;

import java.util.Arrays;

public class Lec24 {
     public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[][] dp = new int[n][n + 1];
        for(int [] row :dp){
            Arrays.fill(row,-1);
        }
        
        return solve(n -1, price,n,dp);
    }
    
    public int solve(int ind,int [] price, int n,int dp[][]){
        if(ind == 0){
            return n * price[0];
        }
        if(dp[ind][n] != -1) return dp[ind][n];
        int notTake = solve(ind - 1, price,n,dp);
        int take = Integer.MIN_VALUE;
        int rodLen = ind + 1;
        if(rodLen <= n ){
            take = price[ind] + solve(ind,price,n-rodLen,dp); 
        }
        
        return dp[ind][n] =Math.max(take,notTake);
    }

    public int cutRodTabu(int[] price){
        int n = price.length;
        int[][] dp = new int[n][n + 1];
        for(int [] row :dp){
            Arrays.fill(row,0);}

            for(int N = 0; N<=n; N++){
                dp[0][N] = N *price[0];
            }

            for(int ind = 1; ind < n;ind++){
                for(int N= 0; N <=n;N++){
                    int notTake = dp[ind - 1][N];
                    int take = Integer.MIN_VALUE;
                    int rodLen = ind + 1;
                    if(rodLen <= N ){
                        take = price[ind] + dp[ind][N-rodLen]; 
                    }
                    
                     dp[ind][N] =Math.max(take,notTake);
                }
            }
            return dp[n-1][n];
        }

       
    }

