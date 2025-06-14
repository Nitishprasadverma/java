package GraphsMike;
import java.util.*;
public class courseSchedule {
    
}


class Solution {



//BFS=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // boolean topologicalSortCheck( ArrayList<ArrayList<Integer>>  adj, int[] degree, int n){
    //      Queue<Integer> que = new LinkedList<>();

    //      int count = 0;

    //      for(int i = 0; i < n;i++ ){
    //         if(degree[i] == 0){
    //             que.add(i);
    //             count++;
    //         }
    //      }

    //      while(!que.isEmpty()){
    //         int u = que.poll();
    //         for(int v : adj.get(u)){
    //             degree[v]--;

    //             if(degree[v] == 0){
    //                 que.add(v);
    //                 count++;
    //             }
    //         }
    //      }
    //      if(count == n) return true;
    
    //     return false;

    // }
    public boolean canFinish(int numCourses, int[][] prerequisites) {


        //BFS+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        //  ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // int[] degree = new int[numCourses];
        // Arrays.fill(degree, 0);

        //  for(int i = 0; i < numCourses  ; i++){
        //     adj.add(new ArrayList<>());
            
        // }

        // for(int [] edge : prerequisites){
        //     int a = edge[0];
        //     int b = edge[1];
        //      //b ---> a .i.e. for picking a we have to pick b first

        //      adj.get(b).add(a);

        //     degree[a]++; // arrow ja rha hai a mein esliye


        // }


        // return topologicalSortCheck(adj,degree, numCourses);


        boolean [] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

          for(int i = 0; i < numCourses  ; i++){
            adj.add(new ArrayList<>());
            
        }

        for(int [] edge : prerequisites){
            int a = edge[0];
            int b = edge[1];
             //b ---> a .i.e. for picking a we have to pick b first

             adj.get(b).add(a);

        }

        for(int i = 0; i < numCourses; i++){
            if(!visited[i] && isCycleDFS(adj,i,visited, inRecursion))
              return false; // can not be complete 
        }

        return true; // can complete
       
    }


  public  boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, boolean[]inRecursion){

        visited[u] = true;
        inRecursion[u] = true;

        for(int v: adj.get(u)){

            //if not visited hit dfs on v

            if(visited[v] == false && isCycleDFS(adj,v,visited, inRecursion)){
                return true;
            }else if(inRecursion[v] == true){
                return true;
            }
        }
        inRecursion[u] = false;
        return false;

    }

}
