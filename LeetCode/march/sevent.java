package march;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class sevent {
    // using hasMap

    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.getOrDefault(nums[i], 0) % 2 == 1)
                return false;
        }
        return true;
    }

    // using hasSet
    public boolean divideArray1(int[] nums) {
        HashSet<Integer> hasSet = new HashSet<>();

        for (int num : nums) {
            if (hasSet.contains(num)) {
                hasSet.remove(num);
            } else {
                hasSet.add(num);
            }
        }
        return hasSet.isEmpty();
    }

    // using XOR
    public boolean divideArray2(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 2) {
            if ((nums[i] ^ nums[i - 1]) != 0)
                return false;
        }
        return true;
    }

    public boolean divideArray3(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1])
                return false;
        }
        return true;
    }

}
