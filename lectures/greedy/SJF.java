package lectures.greedy;

import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {
       int[] bt = {4,3,7,1,2};
       System.out.println(solve(bt));
    }

    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int t = 0, wt = 0;
        for (int i = 0; i < bt.length; i++) {
            wt += t;
            t += bt[i];
        }
        return (wt / bt.length);
    }
}
