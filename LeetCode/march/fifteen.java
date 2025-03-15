package LeetCode.march;

import java.util.Arrays;

public class fifteen {
    public static void main(String[] args) {

    }

    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[n + 1][k + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums, k, 0, dp);
    }

    public int solve(int[] nums, int k, int i, int[][] dp) {
        if (k == 0)
            return 0; // No more house is left to be robbed

        if (i >= nums.length) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][k] != -1)
            return dp[i][k];

        int take = Math.max(nums[i], solve(nums, k - 1, i + 2, dp));

        int not_take = solve(nums, k, i + 1, dp);

        return dp[i][k] = Math.min(take, not_take);

    }

    public int minCapabilityOptimal(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            l = Math.min(l, nums[i]);
            r = Math.max(r, nums[i]);
        }
        int result = r;
        while (l <= r) {
            int mid = l + (r - l) / 2; // capability

            if (isPossible(nums, mid, k)) {
                result = mid;
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public boolean isPossible(int[] nums, int capa, int k) {
        int houseRobbed = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= capa) {
                houseRobbed++;
                i++; // skipping the adjacent house if it was possible to robbed that ith house;
            }
        }
        return houseRobbed >= k;
    }
}
