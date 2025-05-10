package greedy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 }, s = { 1, 1 };
        System.out.println(findContentChildren(g, s));
    }

    static public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0, r = 0;
        int n = g.length;
        int m = s.length;

        while (l < m && r < n) {
            if (g[r] <= s[l]) {
                r++;
            }
            l++;
        }
        return r;
    }
}
