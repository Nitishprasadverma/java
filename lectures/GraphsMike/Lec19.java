package GraphsMike;


//Path and rank compression;
public class Lec19 {


    // Later according to the question we have to initialze these parent and rank .
    int[] parent ;
    int[] rank;

    public int find(int i){
        if(parent[i] != i)
           parent[i] = find(parent[i]);
      
    return parent[i];
    }
    public void union(int x, int y){
        int x_parent = find(x);
        int y_parent = find(y);

        if(x_parent != y_parent){
            if(rank[x_parent] > rank[y_parent]){
                parent[y_parent] = x_parent;
            }else if(rank[y_parent] > rank[x_parent]){
                parent[x_parent] = y_parent;
            }else{
                // if both parent Rank is same then choose any one and make parent to the other and increase the rank of that which is made  parent
                parent[y_parent] = x_parent;
                rank[x_parent] += 1;
            }
        }
    }
}
