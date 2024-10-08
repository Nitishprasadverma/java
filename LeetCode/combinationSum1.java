import java.util.*;
public class combinationSum1 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }

   static List<List<Integer>> combinationSum(int[] candidates, int target){
    List<List<Integer>> ans = new ArrayList<>();
    findCombinations(0, candidates, target, ans, new ArrayList<>());
    return ans;
    }

    static void findCombinations(int ind,int[] arr, int target, List<List<Integer>> asn, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                asn.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], asn, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, asn, ds);
    }
}
