package recursion.Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;

        System.out.println(combinationSum2(candidates, target));
    }

    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }

    static private void findCombinations(int indx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
        }

        for (int i = indx; i < arr.length; i++) {
            if (i > indx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helperFun(0, s, path, ans);
        return ans;
    }

    static public void helperFun(int index, String s, List<String> path, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(path));

        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {

                path.add(s.substring(index, i + 1));
                helperFun(i + 1, s, path, ans);
                path.remove(path.size() - 1);

            }
        }
    }

    static public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
                
        }
        return true;
    }

    // public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
    //     // code here
    // }

    // void solve (int i, int j, ArrayList<ArrayList<Integer>>a, int n, ArrayList<String> ans, String move, int[][] vis){
    //     if(i == n - 1 && j == n-1){
    //         ans.add(move);
    //     }
    //     //downward

    //     if(i + 1<n && !vis[i+1]&&a[i][j] == 1)
    // }

}
