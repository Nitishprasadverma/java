package DP;

import java.util.Arrays;

public class L4c5 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; // Edge case for a single house
 
         // Create nums1 and nums2 to handle circular conditions
         int[] nums1 = new int[nums.length - 1];
         int[] nums2 = new int[nums.length - 1];
 
         for (int i = 0; i < nums.length; i++) {
             if (i != 0)
                 nums1[i - 1] = nums[i]; // Exclude the first house
             if (i != nums.length - 1)
                 nums2[i] = nums[i]; // Exclude the last house
         }
 
         // Solve the two subproblems
         int[] dp1 = new int[nums1.length + 1];
         int[] dp2 = new int[nums2.length + 1];
         Arrays.fill(dp1, -1);
         Arrays.fill(dp2, -1);
 
         int ans1 = solve(nums1.length, nums1, dp1);
         int ans2 = solve(nums2.length, nums2, dp2);
 
         return Math.max(ans1, ans2);
     }
       static public int solve(int n, int[] nums, int[] dp) {
         dp[0] = 0;
         dp[1] = nums[0];
 
         for (int i = 2; i <= n; i++) {
             int rob = nums[i - 1] + dp[i - 2];
             int notRob = dp[i - 1];
             dp[i] = Math.max(rob, notRob);
         }
 
         return dp[n];
         
     }
    
     
}
