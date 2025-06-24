package GraphsMike;



//https://leetcode.com/problems/satisfiability-of-equality-equations/
public class Lec21 {
      int [] parent = new int[26];
    int[] rank = new int[26];
    public int find(int i){
        if(parent[i] != i){
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }


    public void union(int x, int y){
        int x_parent = find(x);
        int y_parent = find(y);

        if(x_parent != y_parent){
           if( rank[x_parent] > rank[y_parent]){
            parent[y_parent] = x_parent;
           }else if(rank[y_parent] > rank[x_parent]){
            parent[x_parent] = y_parent;
           }else{
            parent[y_parent] = x_parent;
            rank[x_parent] += 1;
           }
        }

    }
    public boolean equationsPossible(String[] equations) {
        for(int i =0;i <26; i++){
            parent[i] = i;
            rank[i] = i;

        }



        //handling equalities
        for(String eq : equations){
            if(eq.charAt(1) == '='){
                union(find(eq.charAt(0) -'a'), find(eq.charAt(3) - 'a'));
            }
        }

        //handling unequalities

        for(String eq : equations){
            if(eq.charAt(1) == '!'){
                if(find(eq.charAt(0) - 'a') == find(eq.charAt(3) - 'a')){
                    return false;
                }
            }
        }

        return true;

    }
}
