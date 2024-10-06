import java.util.*;

public class differenceOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,3 };
        int[] nums2 = { 1,1,2,2};
        System.out.println(findDifference(nums1, nums2));

    }

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {



        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>(); //array list for num1
        List<Integer> num2 = new ArrayList<>();//arraylist for num2
       Set<Integer> set1 = new HashSet<>();//set for num1
       Set<Integer> set2 = new HashSet<>(); // set for num2

        //adding the nums1 element into set1
        for (int num : nums1){
            set1.add(num);
        }
          // adding the nums1 element into set2
        for (int num : nums2){
          set2.add(num);
        }
           
        // itertating through nums1 and checking if nums1 element doesn't exist int nums2 if true then adding those into arraylist num1
        for (int num : set1) {
            if (!set2.contains(num) ) {
                num1.add(num);
            }
        }

        // itertating through nums2 and checking if nums2 element doesn't exist int nums1 if true then adding those into arraylist num1
        for (int num : set2) {
            if (!set1.contains(num))
                num2.add(num);
        }
        // addingt both arraylist into list of list i.e ans
        ans.add(num1);
        ans.add(num2);
       
        return ans;
    }
}
