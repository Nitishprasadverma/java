package January;

import java.util.ArrayList;
import java.util.List;

public class FiveJan {
    public static void main(String[] args) {
        
    }

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> asn = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, ds, asn, freq);
        return asn;
    }

   static public void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
        }

        for(int i = 0; i < nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
