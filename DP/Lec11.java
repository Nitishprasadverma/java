package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Lec11 {

    // memoization
    static public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][];

        for (int i = 0; i < triangle.size(); i++) {
            dp[i] = new int[triangle.get(i).size()];
        }

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp, -1);
        }

        return solve(0, 0, dp, triangle);
    }

    static public int solve(int i, int j, int[][] dp, List<List<Integer>> triangle) {

        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);

        int down = triangle.get(i).get(j) + solve(i + 1, j, dp, triangle);
        int downRight = triangle.get(i).get(j) + solve(i + 1, j + 1, dp, triangle);

        return dp[i][j] = Math.min(down, downRight);

    }

    // Tabulation
    static int minimumPathSum(int[][] triangle, int n) {
        int dp[][] = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle[n - 1][j];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int down = triangle[i][j] + dp[i + 1][j];
                int diagonal = triangle[i][j] + dp[i + 1][j + 1];

                dp[i][j] = Math.min(down, diagonal);
            }
        }

        return dp[0][0];
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        // Bruteforce solution
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        long sum = (long)nums[i] + nums[j];
                        sum+= nums[k];
                        sum+= nums[l];

                        if(sum == target){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }



    public List<List<Integer>> fourSum1(int[] nums, int target){
        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0;i < n; i++){
            for(int j = i + 1; j < n; j++){
                Set<Long> hashset = new HashSet<>(); 
                for(int k = j + 1; k < n; k++){
                    long sum = nums[i] + nums[j] ;
                    sum += nums[k];

                    long fourth = target - sum;
                    if(hashset.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);

                        temp.sort(Integer:: compareTo);
                        st.add(temp);
                    }

                    hashset.add((long) nums[k]);
                }
            }
        }

         List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    //optimal approach
    // public List<List<Integer>> fourSum2(int[] nums, int target){

    // }

    
}
