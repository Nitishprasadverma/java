import java.util.ArrayList;

import java.util.List;

public class Subset {
    public static void main(String[] args) {
       ArrayList<List<Integer>> subset = new ArrayList<>();
       ArrayList<Integer> current = new ArrayList<>();
       int[] nums = {1,2,3};
       subSets(nums, current, 0, subset);
       System.out.println(subset);
    }

    static void subSets(int[] nums,ArrayList<Integer> p, int index ,ArrayList<List<Integer>> allSubSets){

        
        if(index == nums.length){
            allSubSets.add(new ArrayList<>(p));
            return ;
        }

        p.add(nums[index]);
        subSets(nums, p, index + 1, allSubSets);

        p.remove(p.size() - 1);
       subSets(nums, p, index + 1, allSubSets);
        
    }
}
