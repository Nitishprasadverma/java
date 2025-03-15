package LeetCode.march;

public class thriteen {
    public static void main(String[] args) {

    }

    // Brute Force
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int totalCandies = 0;
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
            totalCandies += candies[i];
        }
        if (totalCandies < k)
            return 0;

        // start distributing with maxcandies and decrease it one by one see which is
        // best fit
        for (int i = maxCandies; i >= 1; i--) {

            long count = 0;
            for (int j = 0; j < n; j++) {
                // counting is it possible to distribute that maxCandies to k students
                count += candies[j] / i;
            }
            // if counts gets equal to k students and more than that then just return
            if (count >= k)
                return i;
        }
        return 0;
    }

    // Optimal approach
    public static int maxCandiesOptimal(int[] candies, int k) {
        int n = candies.length;
        long totalCandies = 0;
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
            totalCandies += candies[i];
        }
        if (totalCandies < k)
            return 0;

        int i = 1;
        int j = maxCandies;
        int result = 0;
        while (i <= j) {
            int mid = i + ( j - i) / 2;
            if (canDistribute(candies,  k, mid)) {
                result = mid;
                i = mid + 1;
               
            } else {
                j = mid - 1;
            }
        }
        return result;
    }

    private static boolean canDistribute(int[] candies, long k, int mid) {

        for (int i = 0; i < candies.length; i++) {
            k -= candies[i] / mid;
            if (k <= 0)
                return true;
        }
        return k <= 0;
    }

}
