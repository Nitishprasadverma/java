import java.util.*;

public class intersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = {
            {3, 1, 2, 4, 5},
            {1, 2, 3, 4},
            {3, 4, 5, 6}
        };
        System.out.println(intersection(nums));
    }

    static List<Integer> intersection(int[][] nums) {
        
        Set<Integer> intersection = new HashSet<>();
        
        for(int arr : nums[0]){
            intersection.add(arr);
        }

        for(int i  = 1; i < nums.length;i++){
            Set<Integer> currentSet = new HashSet<>();
            for(int num: nums[i]){
                currentSet.add(num);
            }
            intersection.retainAll(currentSet);
        }
List<Integer> ans = new ArrayList<>(intersection);
Collections.sort(ans);

        return new ArrayList<>(intersection);
    }
}

