import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         * 
         * 1 2 3
         * 4 5 6
         * 23 3 4
         * 
         */
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][4]; // Declaration

        int[][] arrs = {
                { 1, 2, 3, 3, 5 },
                { 3, 4, 5, 2 },
                { 5, 3, 2 }
        }; // Declaration with initialization;

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); // shortest way to print the output.
        }

        for (int[] a : arrs) {
            System.out.println(Arrays.toString(a));
        } // Enhance for loop
        in.close();
    }
}
