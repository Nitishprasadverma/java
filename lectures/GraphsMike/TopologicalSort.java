package GraphsMike;
import java.util.*;

class Solution {
    
    // public static void DFS(ArrayList<ArrayList<Integer>>  adj, int u, boolean[] visited , Stack<Integer> st ){
    //     visited[u] = true;
        
        
    //     for(int v : adj.get(u)){
    //         if(!visited[v]){
    //             DFS(adj, v, visited, st);
    //         }
    //     }
        
    //     st.push(u);
    // }
    
   
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        
        //DFS
        
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // for(int i = 0; i < V  ; i++){
        //     adj.add(new ArrayList<>());
            
        // }
        
        // for(int[] edge : edges){
        //     int u = edge[0],  v = edge[1];
        //     adj.get(u).add(v);
        // }
        // // code here
        // boolean [] visited = new boolean [V];
        // Stack<Integer> st = new Stack<>();
        
        // for(int i = 0; i < V  ; i++){
        //     if(!visited[i]){
        //         DFS(adj, i,visited,st);
        //     }
        // }
        
        // ArrayList<Integer> result = new ArrayList<>();
        
        // while(!st.isEmpty()){
        //     result.add(st.pop());
        // }
        
        // return result;
        
        
        
        //BFS
        
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
        
        // pushing the element with 0 degree into queque
        for(int i = 0; i < V; i++ ){
            if(degree[i] == 0){
                que.add(i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while(!que.isEmpty()){
            int u = que.poll();
           result.add(u);
            
            for(int v : adj.get(u)){
                degree[v]--;
                
                if(degree[v] == 0) que.add(v);
            }
        }
        return result;
    }
}