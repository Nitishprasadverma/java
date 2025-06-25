package GraphsMike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Lec27 {
    public List<Integer> shortestPath(int n, int m, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();

        // indexing from 1 to n
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];

            adj.get(u).add(new int[] { v, w });
            adj.get(v).add(new int[] { u, w });

        }

        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[] { 0, 1 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], node = curr[1];

            for (int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0], wt = neighbor[1];
                if (d + wt < dist[adjNode]) {
                    dist[adjNode] = d + wt;
                    pq.offer(new int[] { dist[adjNode], adjNode });
                    parent[adjNode] = node;
                }
            }

        }

        List<Integer> path = new ArrayList<>();

        int node = n;
        // mean last node == max .i.e. last node is never reached so it's value is as
        // max so return -1 mean impossible to reach the last node or destination node
        if (dist[node] == Integer.MAX_VALUE)
            return Arrays.asList(-1);

        while (parent[node] != node) {

            path.add(node);// that last node or destination node
            node = parent[node]; // for the next time it's update matlb jo last node hai destination wala usko
                                 // kiske through hamne visit kia tha (uska parent kon hai )usko hum ab as a node initialize kr diya

        }
        path.add(1); // bcz at the end when parent[node] == 1 then it's break so added manually
                     // outside
        Collections.reverse(path);
        List<Integer> result = new ArrayList<>();
        result.add(dist[n]);
        result.addAll(path);
        return result;
    }
}
