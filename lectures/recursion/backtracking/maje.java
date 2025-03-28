package recursion.backtracking;

import java.util.ArrayList;

public class maje {
    public static void main(String[] args) {
        // System.out.println(count(4, 4));
        // path("", 4, 4);

        // ArrayList<String> ans = digonalPath("", 4, 4);
        // System.out.println(ans);
        boolean[][] boards = {
        {true,true,true},
        {true,false,true},
        {true,true,true}
        };
        pathWithRestriction("", boards, 0, 0);

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {

            path(p + 'R', r - 1, c);
        }
        if (c > 1) {
            path(p + 'D', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r > 1) {

            ans.addAll(pathRet(p + 'R', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRet(p + 'D', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> digonalPath(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {

            ans.addAll(digonalPath(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {

            ans.addAll(digonalPath(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(digonalPath(p + 'H', r, c - 1));
        }
        return ans;
    }
    

    static void pathWithRestriction(String p,boolean [][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c] ) return;
        if (r < maze.length - 1) {
            pathWithRestriction(p + 'D',maze, r + 1, c);
        }
           
        if (c < maze[0].length - 1) {
            pathWithRestriction(p + 'R',maze, r, c + 1);
        }
    }
}
