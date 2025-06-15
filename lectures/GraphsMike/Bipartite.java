package GraphsMike;

import java.util.ArrayList;
import java.util.Arrays;

public class Bipartite {
      public boolean    isBipartiteDFS( ArrayList<ArrayList<Integer>> adj, int curr, int[] color, int currColor){
     color[curr] = currColor;
     
     for(int v : adj.get(curr)){
         if(color[v] == color[curr]) return false;
         
         if(color[v] == -1){
             int colorFind = 1 - currColor; // finding which color should be done 
             if(isBipartiteDFS(adj,v,color,colorFind) == false) return false;
         }
     }
     
     return true;
 }

 //DFS++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public boolean isBipartite(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = edges.length;
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int u = 0; u < V; u++){

            for(int v : edges[u])
           
            
            adj.get(u).add(v);
        }
        
        int[] color = new int[V];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < V; i++){
            if(color[i] == -1){
                if(isBipartiteDFS(adj,i,color,1) == false) return false;
            }
        }
        return true;
    }
}
