// package lectures.sliding-window;

public class maxPoints {
    public static void main(String[] args) {

    }

    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, maxSum = 0;

        //calculation first k element sum left side
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        maxSum = lsum;

        int rightIndex = cardPoints.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }

}
