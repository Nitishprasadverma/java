import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leet3289 {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 2, 1, 3, 2 };
        int[] ans = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> Mapp = new HashMap<>();

        for (int i : nums) {
            Mapp.put(i, Mapp.getOrDefault(i, 0) + 1);
        }

        int[] ans = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : Mapp.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq == 2) {

                ans[i++] = num;

            }
        }
        return ans;
    }
}
