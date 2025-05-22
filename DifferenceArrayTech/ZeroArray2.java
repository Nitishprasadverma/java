package DifferenceArrayTech;

import java.util.*;

public class ZeroArray2 {
    // brute force
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[][] queries = { { 0, 2, 1 }, { 1, 2, 1 }, { 1, 1, 3 } };

        findNumbersOfqueries(nums, queries);
    }

    // Brute force TLE
    public static int findNumbersOfqueries(int[] nums, int[][] queries) {
        int numbersOfqueries = 0;

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int value = query[2];

            for (int i = start; i <= end && i < nums.length; i++) {
                nums[i] = Math.max(0, nums[i] - value);
            }

            numbersOfqueries++;

            boolean isZeroArray = true;
            for (int num : nums) {
                if (num != 0) {
                    isZeroArray = false;
                    break;
                }
            }

            if (isZeroArray)
                return numbersOfqueries;
        }

        return -1;
    }



    //Better thana brtue TLE
    public int minZeroArray(int[] nums, int[][] queries) {
        // ✅ Step 0: Early check
        boolean isAlreadyZero = true;
        for (int num : nums) {
            if (num != 0) {
                isAlreadyZero = false;
                break;
            }
        }
        if (isAlreadyZero)
            return 0;

        for (int i = 0; i < queries.length; i++) {
            if (isZeroArray(nums, queries, i)) {
                return i + 1;
            }

        }

        return -1;
    }



    //Optimal
    public int minZeroArray1(int[] nums, int[][] queries) {
        // ✅ Step 0: Early check
        boolean isAlreadyZero = true;
        for (int num : nums) {
            if (num != 0) {
                isAlreadyZero = false;
                break;
            }
        }
        if (isAlreadyZero)
            return 0;

        
        int l = 0;
        int r = queries.length -1;
        int k = -1;

        while (l <= r) {
            int mid = l + (r -l )/ 2;
            if(isZeroArray(nums,queries,mid)){
                k =mid + 1;
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }

        return k;
    }

    public boolean isZeroArray(int[] nums, int[][] queries, int k) {
        int n = nums.length;

        // Step 1 create difference array
        int[] diffArray = new int[n];
        Arrays.fill(diffArray, 0);

        for (int i = 0; i <= k; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];

            diffArray[start] += value;
            if (end + 1 < n) {
                diffArray[end + 1] -= value;
            }

        }

        // commulative sum

        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += diffArray[i];
            diffArray[i] = cumSum;

            if (nums[i] - diffArray[i] > 0)
                return false; // nums[i] 0 nhi ban paya
        }

        return true;

    }



}
