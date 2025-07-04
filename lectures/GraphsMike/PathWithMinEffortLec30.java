package GraphsMike;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PathWithMinEffortLec30 {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] dirs = {
            {-1,0},{0,-1},{0,1},{1,0}
        };

        int[][] result = new int[m][n];

        for(int [] row : result){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        pq.offer(new int[]{0,0,0}); // {effort, x, y}
        result[0][0] = 0;

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int diff = curr[0];
            int x = curr[1];
            int y = curr[2];

            if(x == m -1 && y ==  n -1) return diff;

            for(int[] dir : dirs){
                int x_  = x + dir[0];
                int y_ = y + dir[1];
            

                if(x_ >= 0  && x_ < m && y_ >= 0 && y_ < n){
                    int newDiff = Math.max(diff, Math.abs(heights[x][y] - heights[x_][y_]));

                    if(result[x_][y_] > newDiff){
                        result[x_][y_] = newDiff;
                        pq.offer(new int[] { newDiff, x_, y_});
                    }
                }
            }
        }

        return result[m - 1][n -1];
    } 
}
