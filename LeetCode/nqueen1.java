import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class nqueen1 {
    public static void main(String[] args) {
        int n = 4;
        List <List<String>> queen = solveNQueens(n);
        System.out.println(queen);
    }


     public static List < List < String >> solveNQueens(int n){
        char[][] board = new char[n][n];

        for(int i   = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';

            }
        }

        List < List <String>> res = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDigonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        solve(0, board,res,leftRow,lowerDiagonal,upperDigonal);
        return res;
    }

    static void solve(int col, char[][] board, List<List<String>>res, int leftRow[], int lowerDiagonal[], int upperDigonal[]){
        if(col == board.length){
            res.add(construct(board));
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDigonal[board.length - 1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDigonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDigonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                 lowerDiagonal[row + col ] = 0;
                 upperDigonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    static List< String> construct(char[][] board){
        List<String> res = new LinkedList<>();
        for(int i = 0; i < board.length; i++ ){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
