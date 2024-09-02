import java.util.*;

public class TwoDArayToOneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] NonSquareMetrics = {
                { 1, 2, 3, 4, 3 },
                { 5, 6, 7, 8, 2, 4, 5, 7 },
                { 9, 10, 11, 12, 13 }
        };
        int[][] SquareMetrices = {
                { 1, 2, 3, 4, 3 },
                { 5, 6, 7, 8, 2, },
                { 9, 10, 11, 12, 13 }
        };
        int[] ans1 = OneD_Array_Square_metrics(SquareMetrices);
        System.out.print(Arrays.toString(ans1));
        int ans[] = OneD_Array_FromNon_Square(NonSquareMetrics);
        System.out.println(Arrays.toString(ans));
        in.close();
    }

    static int[] OneD_Array_Square_metrics(int[][] arr) {
        int numRows = arr.length;
        int col = arr[0].length;
        int total = numRows * col;
        int oneArray[] = new int[total];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int ele = arr[i][j];
                oneArray[k] = ele;
                k++;
            }

        }

        return oneArray;
    }

    static int[] OneD_Array_FromNon_Square(int[][] arr) {
        // int numRows = arr.length;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].length;
        }
        // System.out.println(total);
        int oneArray[] = new int[total];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int ele = arr[i][j];
                oneArray[k] = ele;
                k++;
            }

        }

        return oneArray;
    }
}

