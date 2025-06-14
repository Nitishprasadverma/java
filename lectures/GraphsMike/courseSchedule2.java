package GraphsMike;
import java.util.*;
public class courseSchedule2 {
    
}

class Solution {


// //BFS
    int[] topologicalSort(ArrayList<ArrayList<Integer>> adj,int n, int[] degree){
        Queue<Integer> que = new LinkedList<>();
        int count = 0;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(degree[i] == 0) {
                que.add(i);
                count++;
                result.add(i);
            }
        }

        while(!que.isEmpty()){
            int u = que.poll();

            for(int v : adj.get(u)){
                degree[v]--;
                if(degree[v] == 0){
result.add(v);
                count++;
                que.add(v);
                }
                
            }
        }
        if(count == n) {
            
           int ans[] = result.stream().mapToInt(i -> i).toArray();
            return ans;
        }

        return new int[0] ;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int [] degree = new int[numCourses];  // kanh's Algorithm

        Arrays.fill(degree,0);

        for(int i  = 0 ; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int [] pre : prerequisites){
            int a = pre[0];
            int b = pre[1];

            adj.get(b).add(a);

            degree[a]++;
        }

        return topologicalSort(adj,numCourses,degree);

    
     }



     // DFS+++++++++++++++++++++++++++++++++++++++++++++++
}