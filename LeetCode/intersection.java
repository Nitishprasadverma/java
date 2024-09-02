import java.util.Arrays;
import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersections(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] intersections(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();

          for(int num : nums1){
            set.add(num);
          }
          HashSet<Integer> intersection = new HashSet<>();
          for(int num : nums2){
            if(set.contains(num)){
                intersection.add(num);
            }
          }
          int output[] = new int[intersection.size()];
          int index = 0;
          for(int num : intersection){
            output[index++] = num;
          }
          return output;
        

    }
}
