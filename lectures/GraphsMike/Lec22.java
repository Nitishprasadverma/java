package GraphsMike;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/number-of-operations-to-make-network-connected/
public class Lec22 {
     List<Integer> parent;
    List<Integer> rank;

    public int find(int x){
        if(x == parent.get(x)) return x;
         
        parent.set(x, find(parent.get(x))); // path compression
        return parent.get(x);
    }

    public void union(int x, int y){
        int xParent = find(x);
        int yParent = find(y);

        if(xParent == yParent) return;

        if(rank.get(xParent) > rank.get(yParent)){
            parent.set(yParent,xParent);
        }else if(rank.get(xParent) < rank.get(yParent)){
            parent.set(xParent,yParent);
        }else{
            parent.set(xParent,yParent);
            rank.set(yParent,rank.get(yParent) + 1);
        }
    }

    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1 ) return -1;


        parent = new ArrayList<>(n);
        rank = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            parent.add(i);
            rank.add(0);
        }

        int components = n;
        for(int [] conn:  connections){
            if(find(conn[0]) != find(conn[1])){
                components--;
                union(conn[0], conn[1]);
            }
        }
        
        return components - 1;
    }
}
