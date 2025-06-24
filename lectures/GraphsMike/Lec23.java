package GraphsMike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec23 {

    // Using DFs
    class Solution {

        public int dfs(List<List<Integer>> adj, int u, boolean[] visited) {
            visited[u] = true;
            int size = 1;

            for (int v : adj.get(u)) {
                if (!visited[v])
                    size += dfs(adj, v, visited);
            }
            return size;
        }

        public long countPairs(int n, int[][] edges) {
            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }

            for (int[] edge : edges) {
                int u = edge[0], v = edge[1];
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            int remainingNodes = n;
            boolean[] visited = new boolean[n];
            Arrays.fill(visited, false);
            long result = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    long size = dfs(adj, i, visited);

                    result += (size) * (remainingNodes - size);
                    remainingNodes -= size;
                }
            }
            return result;
        }
    }

    class Dsu {
        int[] parent;
        int[] rank;

        public int find(int x) {
            if (parent[x] == x)
                return x;

            return parent[x] = find(parent[x]);
        }

        public void union(int x, int y) {
            int x_parent = find(x);
            int y_parent = find(y);

            if (x_parent == y_parent)
                return;

            if (rank[x_parent] > rank[y_parent]) {
                parent[y_parent] = x_parent;
            } else if (rank[y_parent] > rank[x_parent]) {
                parent[x_parent] = y_parent;
            } else {
                parent[x_parent] = y_parent;
                rank[y_parent]++;
            }
        }

        public long countPairs(int n, int[][] edges) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }

            for (int[] edge : edges) {
                int u = edge[0], v = edge[1];
                union(u, v);
            }

            Map<Integer, Integer> groupSize = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int root = find(i);

                groupSize.put(root, groupSize.getOrDefault(root, 0) + 1);
            }

            long result = 0;
            long remainingNodes = 0;
            for (int size : groupSize.values()) {
                result += size * (remainingNodes - size);
                remainingNodes = size;
            }
            return result;
        }
        
    }
}
