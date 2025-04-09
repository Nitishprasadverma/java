import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class min3396 {
    int n;

    public int minimumOperations(int[] numsArr) {
        List<Integer> nums = new ArrayList<>();
        for (int num : numsArr)
            nums.add(num);

        n = nums.size();
        int ops = 0;
        for (int i = 0; i < n; i += 3) {
            if (check(nums, i) == true) {
                return ops;
            }
            ops++;
        }
        return ops;
    }

    boolean check(List<Integer> nums, int start) {
        Set<Integer> st = new HashSet<>();
        for (int j = start; j < n; j++) {
            if (st.contains(nums.get(j))) {
                return false;
            }
            st.add(nums.get(j));
        }
        return true;
    }
}
