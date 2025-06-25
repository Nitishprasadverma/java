package  GraphsMike;
import java.util.*;


public class Lec24 {

    public int[] dijkstra(int V, int[][] edges, int src){

    List<List<int[]>> adj = new ArrayList<>();
    for(int i  = 0; i < V; i++){
        adj.add(new ArrayList<>());
    }

    for(int [] edge : edges){
        int u = edge[0] , v =edge[1], wt = edge [2];

        adj.get(u).add(new int[] {v, wt});
        adj.get(v).add(new int[]{u, wt});
    }

    int[] dist = new int[V];
    Arrays.fill(dist, Integer.MAX_VALUE);

    dist[src] = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    pq.offer(new int[] {0, src});

    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int d = curr[0], node = curr[1];

        for(int []  neighbor : adj.get(node)){
            int adjNode = neighbor[0], wt = neighbor[1];

            if(d + wt < dist[adjNode]){
                dist[adjNode] = d + wt;
                pq.offer(new int[] { dist[adjNode], adjNode});
            }
        }
        
    }
    return dist;
}
}
