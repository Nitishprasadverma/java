import java.util.*;

public class interSection2 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> set1 = new HashMap<>();


        //putting the value into map data structure alogn with how many times a particular elements occurs in nums1
        for (int num : nums1) {
            set1.put(num, set1.getOrDefault(num, 0) + 1);

        }
        // decclared an arraylist to store the intersection element 
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (set1.containsKey(num) && set1.get(num) > 0) {
                list.add(num);
                set1.put(num, set1.get(num) - 1);
            }
        }

        // converitng the arraylist into array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

      
        return ans;
    }
}
