package GraphsMike;
import java.util.*;
public class UndirectedGraph {
    
}

//DFS
class Solution {
    
    public boolean isCycleDfs(  List<List<Integer>> adj, int u, boolean [] visited, int p){
        visited[u] = true;
        
        for(int v: adj.get(u)){
            if(v== p) continue;
            if(visited[v]) return true;
            if(isCycleDfs(adj, v,visited,u)) return true;
        }
        
        return false;
        
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        
        
        
        //build adjacency list
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i= 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        
        for(int[] edge : edges){
            int u = edge[0], v= edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        
        for(int i = 0;i < V; i++){
            if(!visited[i] && isCycleDfs(adj,i,visited,-1)){
                return true;
            }
        }
        return false;
        
    }
}