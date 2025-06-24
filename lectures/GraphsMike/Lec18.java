package GraphsMike;

public class Lec18 {
     int find(int par[], int x) {
        // add code here.
        if(par[x] == x) return x;
        
        return par[x] = find( par, par[x]);
    }

    void unionSet(int par[], int x, int z) {
        // add code here.
        int a = find(par, x);
        int b = find(par, z);
        
        if(a == b) return ;
        
        par[a] = b;
    }
}
