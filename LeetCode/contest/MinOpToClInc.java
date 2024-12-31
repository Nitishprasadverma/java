package contest;

public class MinOpToClInc {
    public static void main(String[] args) {
        int[][] arr = {
            {3,2},
            {1,3},
            {3,4},
            {0,1}
        };

        System.out.println(minimumOperations(arr));
    }

    static int minimumOperations(int[][] grid) {
        int cnt = 0;

        for(int col = 0; col < grid[0].length; col++){

            for(int row = 0; row < grid.length - 1 ; row++){

                if(grid[row + 1][col] > grid[row][col]) continue;

                if(grid[row + 1][col] <= grid[row][col]){
                    int diff = grid[row][col] - grid[row + 1][col] + 1;
                    grid[row + 1][col] += diff;
                    cnt += diff;

                }
            }

        }
        return cnt;
    }
}
