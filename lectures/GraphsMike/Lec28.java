package GraphsMike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Lec28 {
     public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int [] time : times){
            int u = time[0], v = time[1], wt = time[2];
            adj.get(u).add(new int[] {v, wt});
        }

        int[] dist = new int[n+ 1 ];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[] {0, k});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0], node = curr[1];

            for(int [] neighbor : adj.get(node)){
                int adjNode = neighbor[0], wt = neighbor[1];
                if(d + wt < dist[adjNode]){
                    dist[adjNode] = d + wt;
                    pq.offer(new int[] { dist[adjNode], adjNode});
                } 
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 1 ;i <= n; i++){
              if (dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
             
        }

        return  ans;
    }
}
