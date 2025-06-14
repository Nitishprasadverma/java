package GraphsMike;
import java.util.*;
public class DirectedGraphCycle {
    
}


class Solution {

    //BFS+++++++++++++++++++++++++++++++++++++++++++++++++++
    public boolean isCyclic(int V, int[][] edges) {
        // code here
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V  ; i++){
            adj.add(new ArrayList<>());
            
        }
        
        for(int[] edge : edges){
            int u = edge[0],  v = edge[1];
            adj.get(u).add(v);
        }
        
        
        
        Queue<Integer> que = new LinkedList<>();
        int[] degree = new int[V];
        Arrays.fill(degree,0);
        
        
        for(int u = 0;u<V;u++){
            for(int v : adj.get(u)){
                degree[v]++;
            }
        }
        
        int count  = 0;
        // pushing the element with 0 degree into queque
        for(int i = 0; i < V; i++ ){
            if(degree[i] == 0){
                que.add(i);
                 count++;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while(!que.isEmpty()){
            int u = que.poll();
           result.add(u);
            
            for(int v : adj.get(u)){
                degree[v]--;
                
                if(degree[v] == 0){
                    que.add(v);
                    count++;
                } 
            
            }
        }
        
        if(count == V){
            return false;
        }
        return true;
    }
}