package GraphsMike;
import java.util.*;
public class DFS {
    
}


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> result = new ArrayList<>();
        
        solve(0, visited, adj, result);
        
        return result;
        
    }
    
    public void solve(int u, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result){
        if(visited[u] )return;
        visited[u] = true;
        result.add(u);
        for (int v : adj.get(u)){
            if(!visited[v]){
                solve(v, visited, adj,result);
            }
        }
    }
}