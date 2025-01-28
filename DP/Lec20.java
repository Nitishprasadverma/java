package DP;
import java.util.Arrays;
public class Lec20 {

    public static void main(String[] args) {
        int[] val= {3, 1, 3};
        int[] wt = {7 ,3 ,3};
        int capacity = 4;
        System.out.println(knapSack(val, wt, capacity));
    }
    static int knapSack(int val[], int wt[], int capacity) {
        // code here int n = wt.length;
        int n = wt.length;
        int[][] dp = new int[n][capacity + 1];

        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(val, wt, n - 1, capacity, dp);
    }
    
    static int solve(int[] val, int[] wt, int ind , int capacity, int[][] dp){
        if(ind == 0){
            if(wt[0] <= capacity){
                 return capacity / wt[0] * val[0];
            }else return 0;
        }

        if(dp[ind][capacity] != -1) return dp[ind][capacity];
        int notTake = 0 + solve(val, wt, ind - 1, capacity,dp);

        int take = (int) Math.pow(10,-9);

        if(wt[ind] <= capacity){
            take = val[ind] + solve(val, wt, ind, capacity - wt[ind],dp);
        }
        return dp[ind][capacity] =Math.max(notTake, take);
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
       int[][] dp = new int[n][amount + 1];
       for (int[] row : dp) {
           Arrays.fill(row, -1);
       }
       return solve(n - 1, coins, amount, dp);

   }

    public int solve(int ind, int coins[], int amount, int[][] dp) {
       if (ind == 0) {
           if (amount % coins[0] == 0){
               return 1;
           }else{
               return 0;
           }
             
       }

       if (dp[ind][amount] != -1)
           return dp[ind][amount];
       int notTake = 0 + solve(ind - 1, coins, amount, dp);
       // int min = Integer.MAX_VALUE;
       int take = 0;
       if (coins[ind] <= amount) {
           take =  solve(ind, coins, amount - coins[ind], dp);
       }
       return dp[ind][amount] = take + notTake;
   }
}
