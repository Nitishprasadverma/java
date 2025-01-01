import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class FirstJan {

    static class FirstJanx {
    
        int index;
    int value;

    FirstJanx(int index, int value) {
        this.index = index;
        this.value = value;
    }
    }
    
    public static void main(String[] args) {
        // String s = "1111";
        // System.out.println(maxScore(s));
        int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] ans = dailyTemperatures(nums);
        System.out.println(Arrays.toString(ans));

    }

    static public int maxScore(String s) {
        int max = 0;
        int one = 0;
        int zero = 0;
        int sum = 0;
        int ndone = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                ndone++;
            }
            sum = zero + one - ndone;
            max = Math.max(max, sum);
        }
        return max;
    }

    static public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length * 2 - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i % n]);
        }
        return ans;
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack<FirstJanx> st = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
          
            while (!st.isEmpty() && st.peek().value <= temperatures[i])
                st.pop();
            if (!st.isEmpty()) {
                ans[i] = st.peek().index - i;
            } else{
                ans[i] =0;
            }

            st.push(new FirstJanx(i, temperatures[i]));

        }

        return ans;

    }

    

}
