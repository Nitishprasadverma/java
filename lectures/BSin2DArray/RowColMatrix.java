import java.util.*;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
            
        };
        int[] ans = search(arr,38);
        System.out.print(Arrays.toString(ans));

    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;  //if there would be not square matrix then col iseual to be max number of column in it.

        while(r < matrix.length && c >= 0){
           if(matrix[r][c] == target){
            return new int[]{r,c};
           }
           if(matrix[r][c] < target){
            r++;
           }
           else{
            c--;
           }
        }
return new int[]{-1,-1};
    }
}
