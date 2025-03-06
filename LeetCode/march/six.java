package march;

import java.util.Arrays;
import java.util.HashSet;

public class six {
    public static void main(String[] args) {
        int[][] grid = {
            {1,3},
            {2,2},
        
        };

        int [] ans = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(ans));
        
    }
    static public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        HashSet<Integer> set = new HashSet<>();
        int a = -1, b=-1;

        // method to calculate the duplicate as well as adding into hashset for further easily iterating
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){

                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        //method to calculate the missing number
        for(int i = 1; i <= N; i++){
            if(!set.contains(i)){
                b = i;
                break;
            }
        }

        return new int[] {a,b};
    }

}
