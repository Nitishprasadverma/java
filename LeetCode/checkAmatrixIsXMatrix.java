public class checkAmatrixIsXMatrix {
    public static void main(String[] args) {
        int [][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(grid));
    }
    static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i< n; i++){
            for(int j  = 0; j<n; j++){

                //checking both digonal element
                if((i==j) || (i+j) == (n-1) ){
                    if(grid[i][j] == 0) return false;
                }
                else{
                    //checking non digonal elements 
                    if(grid[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}
