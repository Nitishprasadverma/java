import java.util.*;
public class luckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
            {3,7,8},{9,11,13},{15,16,17}
        };

        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < rows; i++){
            int min = matrix[i][0];
            int mincolIndex = 0;
        //finding the min in each row
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    mincolIndex = j;
                }
            }

            boolean isMax = true;
                //checking is that min is max in itself column;
            for(int k = 0; k < rows; k++){
                if(matrix[k][mincolIndex] > min){
                    isMax = false;
                    break;
                }
            }

            if(isMax){
                ans.add(min);
            }
        }
        return ans;
    }
}
