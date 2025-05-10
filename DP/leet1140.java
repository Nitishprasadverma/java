package DP;

// //Alice and Bob continue their games with piles of stones. There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i]. The objective of the game is to end with the most stones.

// Alice and Bob take turns, with Alice starting first.

// On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M. Then, we set M = max(M, X). Initially, M = 1.

// The game continues until all the stones have been taken.

// Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.

public class leet1140 {
    public static void main(String[] args) {
        int[] piles = { 2, 7, 9, 4, 4 };
        int ans = stoneGame2(piles);
        System.out.println(ans);
    }

    static public int stoneGame2(int[] piles) {
        int n = piles.length;

        Integer[][][] dp = new Integer[n][n + 1][2];
        return solveForAlice(piles, 0, 1, 0, dp); // alice 0
    }

    static public int solveForAlice(int[] piles, int index, int M, int player, Integer[][][] dp) {
        if (index >= piles.length)
            return 0;
        if (dp[index][M][player] != null)
            return dp[index][M][player];
        int result = (player == 0) ? 0 : Integer.MAX_VALUE;
        int total = 0;

        for (int i = 1; i <= 2 * M && index + i <= piles.length; i++) {
            total += piles[index + i - 1];

            if (player == 0) {
                result = Math.max(result, total + solveForAlice(piles, index + i, Math.max(M, i), 1, dp));
            } else {
                result = Math.min(result, solveForAlice(piles, index + i, Math.max(M, i), 0, dp));
            }
        }
        dp[index][M][player] = result;
        return result;
    }

    // recursive code

    // public int solveForAlice(int[] piles, int index, int M, boolean isAlice) {
    // if (index >= piles.length)
    // return 0;

    // int maxStones = isAlice ? 0 : Integer.MAX_VALUE;
    // int total = 0;

    // for (int i = 1; i <= 2 * M && index + i <= piles.length; i++) {
    // total += piles[index + i - 1];

    // if (isAlice) {
    // maxStones = Math.max(maxStones, total + solveForAlice(piles, index + i,
    // Math.max(M, i), false));
    // } else {
    // maxStones = Math.min(maxStones, solveForAlice(piles, index + i, Math.max(M,
    // i), true));
    // }
    // }
    // return maxStones;
    // }

}


// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int sum  = 0;
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             int left = i + 1;
//             int ryt = n - i;
//             int totalSubArr = left * ryt;
//             int oddLengt = (totalSubArr + 1 ) / 2;
//             sum += arr[i] * oddLengt;
//         }
//         return sum;
//     }
// }