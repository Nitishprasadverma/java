public class maximumMatrix1975 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { -1, -2, -3 },
                { 1, 2, 3 }
        };
        System.out.println(maxMatrixSum(matrix));
    }

    static long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;

        long sum = 0;

        int negCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    negCount++;
                    int abValue = Math.abs(matrix[i][j]);
                    min = Math.min(min, abValue);
                    sum += abValue;
                }
            }
        }

        if (negCount % 2 == 0)
            return sum;
        return sum - 2 * min;
    }
}
