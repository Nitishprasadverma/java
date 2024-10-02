import java.util.*;
public class columnContainAllNumber {
    public static void main(String[] args) {
        
    }

    static boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        //eahc row checks
        for(int i = 0; i < n; i++){
            Set<Integer> row = new HashSet<>();

            for(int j = 0; j < n; j++){
                if( row.contains(matrix[i][j])){
                    return false;
                }
                row.add(matrix[i][j]);
            }
        }


        //each column checks
        for(int j = 0; j < n; j++){
            Set<Integer> col = new HashSet<>();

            for(int i = 0; i< n; i++){
                if( col.contains(matrix[j][i])){
                    return false;
                }
                col.add(matrix[j][i]);
            }
        }
        return true;
    }
    
}
