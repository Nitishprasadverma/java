package DifferenceArrayTech;

public class RangeUpdates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] diff = new int[n + 1];

        // Example range update: add 10 to elements from index 1 to 3
        int[][] rangeUpdate = {{1, 3, 10},{0,2,3}}; // {left index, right index, value to add}

        for (int[] update : rangeUpdate) {
            int l = update[0]; // left index
            int r = update[1]; // right index
            int x = update[2]; // value to add

            diff[l] += x; // Add x at the left index

            //check
            // If the right index is within bounds, subtract x at the right index + 1
            if (r + 1 < n) {
                diff[r + 1] -= x; // Subtract x at the right index + 1
            }
        }

        // Apply the difference array to get the updated array
        //commulative sum starting from index 1
        // The first element remains the same
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
            arr[i] += diff[i];
        }

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}