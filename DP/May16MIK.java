import java.util.*;


// 300. Longest Increasing Subsequence
// 
// Given an integer array nums, return the length of the longest strictly increasing subsequence.

 

// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.


class Solution {
    public int lengthOfLIS(int[] nums) {

//         int n = nums.length;

//         int [][] dp = new int[2501][2501];
//         for (int[] row : dp) {
//     Arrays.fill(row, -1);
// }

//         return solve(0,-1,nums, dp);

int[] t = new int[2500];
Arrays.fill(t,1);
int maxLIS = 1;
for(int i = 0; i < nums.length; i++){

    for(int j = 0; j < i; j++){
        if(nums[j] < nums[i]){
            t[i] = Math.max(t[i], t[j] + 1);
            maxLIS = Math.max(maxLIS, t[i]);
        }
    }
}

return maxLIS;
    }

    public int solve(int idx, int prev,int[] nums, int[][] dp ){
        if(idx >= nums.length) return 0;

        if(prev != -1 && dp[idx][prev] != -1) return dp[idx][prev];
        int take = 0;
        if(prev == -1 || nums[prev] < nums[idx]){
             take = 1 + solve(idx + 1, idx, nums,dp);
        }

        int skip = solve(idx + 1, prev, nums,dp);

        if(prev != -1)
         dp[idx][prev] = Math.max(take, skip);

        return  Math.max(take, skip);
    }
}








// 646. Maximum Length of Pair Chain

// You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.

// A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.

// Return the length longest chain which can be formed.

// You do not need to use up all the given intervals. You can select pairs in any order.

 

// Example 1:

// Input: pairs = [[1,2],[2,3],[3,4]]
// Output: 2
// Explanation: The longest chain is [1,2] -> [3,4].


class Solution1 {
    
    public int findLongestChain(int[][] pairs) {
    //    int[][] dp = new int[1001][1001];
    //    for(int [] row: dp){
    //     Arrays.fill(row, -1);
    //    }
    //      Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
    //    return solve(pairs, 0,-1,dp);

    int[] t = new int[2500];
Arrays.fill(t,1);
Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
 int maxLIS = 1;

 for(int i = 0; i< pairs.length; i++){
    for(int j = 0; j < pairs.length; j++){
        if(pairs[j][1] < pairs[i][0] ){
            t[i] = Math.max(t[i], t[j] + 1);
            maxLIS = Math.max(maxLIS, t[i]);
        }
    }
 }
 return maxLIS;

    }

    public int solve(int[][] pairs, int idx, int prev, int[][] dp){
        if(idx == pairs.length) return 0;

        if(prev != -1 && dp[idx][prev] != -1) return dp[idx][prev];

        int take = 0;

        if(prev == -1 || pairs[idx][0] > pairs[prev][1]){
            take = 1 + solve(pairs, idx + 1, idx, dp);
        }
        int notTake = solve(pairs, idx + 1, prev, dp);

        if(prev != -1)
          dp[idx][prev] = Math.max(take, notTake);
         
        return Math.max(take, notTake);
    }
}






// 1048. Longest String Chain

// You are given an array of words where each word consists of lowercase English letters.

// wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.

// For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
// A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.

// Return the length of the longest possible word chain with words chosen from the given list of words.

 

// Example 1:

// Input: words = ["a","b","ba","bca","bda","bdca"]
// Output: 4
// Explanation: One of the longest word chains is ["a","ba","bda","bdca"].

class Solution2 {
    public int longestStrChain(String[] words) {
         Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // int[][] dp = new int[1000][1000];
        // for(int[] row : dp){
        //     Arrays.fill(row, -1);
        // }

        // return solve(words, 0,-1, dp);

        int[] dp = new int[words.length];
        Arrays.fill(dp,1);
        int maxLen = 1;

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < i; j++){
                if(isPred(words[j], words[i])){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }
        return maxLen;
    }

    public int solve(String [] words, int idx, int prev, int [][] dp){
        if(idx == words.length) return 0;


        if(prev != -1 && dp[idx][prev] != -1) return dp[idx][prev];

        int take = 0;
        if(prev == -1 || isPred(words[prev],words[idx])){
            take = 1 + solve(words, idx + 1, idx,dp);
        }


          int notTake = solve(words, idx + 1, prev,dp);
if(prev != -1){
    dp[idx][prev] = Math.max(take,notTake);
}
      

        return Math.max(take, notTake);
    }

    boolean isPred(String prevWord, String currWord){
        int M = prevWord.length();
        int N = currWord.length();

        if( M >= N || N - M != 1) return false;

        int i = 0, j = 0;

        while(i < M && j < N){

            if(prevWord.charAt(i) == currWord.charAt(j)) i++;

            j++;
        }

        return i == M;
    }

   
}