package GraphsMike;

public class BellmanFrod31 {
     public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int [] dist = new int[V];
        int INF = (int)1e8;
        
        for(int i = 0; i < V; i++){
            dist[i] = INF;
        }
        
        dist[src] = 0;
        for(int i =  0; i < V - 1; i++){
            for(int[] edge : edges){
                int u  = edge[0];
                int v = edge[1];
                int w = edge[2];
                
                if(dist[u] != INF && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        

        //one more relaxation for -ve cycle detection
         for(int[] edge : edges){
                int u  = edge[0];
                int v = edge[1];
                int w = edge[2];
                
                if(dist[u] != INF && dist[u] + w < dist[v]){
                   return new int[] {-1};
                }
            }
            return dist;
    }
}
