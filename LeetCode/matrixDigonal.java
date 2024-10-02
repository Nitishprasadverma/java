public class matrixDigonal {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        for(int i =  0; i < mat.length; i++){
            //primary digonal sum
            sum += mat[i][i];
            //seconday diagonal sum
            sum += mat[i][n-i-1];
            }
        
       //edge case if the size of the array is odd;
        if( n % 2 == 1){
           
            sum -= mat[n / 2][n / 2];
        }
       return sum;
    }

}