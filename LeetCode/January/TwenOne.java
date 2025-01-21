package January;
import java.util.*;

public class TwenOne {
    public static void main(String[] args) {
        
    }




    //BruteForce approach  TLE
    public  static boolean checkRowPainted(int[][] mat,int row){
        for(int col = 0;col < mat[0].length; col++){
            if(mat[row][col] >0){
                return false;
            }

       }
       return true; 
    }

    public  static boolean checkColPainted(int[][] mat,int col){
        for(int row = 0;row < mat.length; row++){
            if(mat[row][col] >0){
                return false;
            }

       }
       return true; 
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer,int[]> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int val = mat[i][j];
                map.put(val, new int[]{i,j});
            }
        }

        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            int[] cordinates = map.get(val);
            int row = cordinates[0], col = cordinates[1];

            mat[row][col] = -1;//paint

            if(checkRowPainted(mat, row) || checkColPainted(mat,col)){
                return i;
            }
           

        }
        return -1;
    }

    // better approach
    public int firstCompleteIndexBetter(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer,int[]> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int val = mat[i][j];
                map.put(val, new int[]{i,j});
            }
        }

     int[] rowCountPaint = new int[m];
     int[] colCountPaint = new int[n];

     for(int i = 0; i < arr.length; i++){
        int val = arr[i];
        int[] cordinates = map.get(val);
        int row = cordinates[0], col = cordinates[1];

        rowCountPaint[row]++;
        colCountPaint[col]++;

        if(rowCountPaint[row] == n || colCountPaint[col] == m) return i;

        
     }
     return -1;
    }

     public long gridGame(int[][] grid) {
        long firstRowRemainSum = 0;
        for(int num : grid[0]){
            firstRowRemainSum += num;
        }
        long secondRowRemainSum = 0;
        long miniMizeRobot2Sum = Long.MAX_VALUE;
        for(int robbotCol = 0; robbotCol < grid[0].length; robbotCol++){
            firstRowRemainSum -= grid[0][robbotCol];

            long bestOfRobot2 = Math.max(firstRowRemainSum, secondRowRemainSum);

            miniMizeRobot2Sum = Math.min(miniMizeRobot2Sum, bestOfRobot2);

            secondRowRemainSum += grid[1][robbotCol];
        }
        return miniMizeRobot2Sum;
     }
}
