import java.util.Arrays;

public class rotateImg {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[][] matrix) {
       int n = matrix.length ;

       //transpose the matrix

       for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       }


       // reverse each rows

       for(int i = 0; i < n; i++){
         int start = 0 , end = n - 1;
         while (start < end) {
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
         }
       }
    }
}
