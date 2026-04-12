package GraphsMike;

public class FloydWarshall32 {
    public void floydWarshall(int[][] dist) {
        // Code here
        int n = dist.length;
         int INF = 100000000;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
               if(dist[i][j] == INF){
                   dist[i][j] = 100000;
               } 
            }
        }
        for(int via = 0; via < n; via++){
            for(int i = 0; i < n; i++){
                
                for(int j  = 0; j < n; j++){
                    
                    if(dist[i][via] == 100000 || dist[via][j] == 100000)continue;
                    dist[i][j] = Math.min(dist[i][j], dist[i][via] + dist[via][j]);
                }
            }
        }
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dist[i][j] == 100000){
                    dist[i][j] = INF;
                } 
            }
               
        }
        
    }
}
