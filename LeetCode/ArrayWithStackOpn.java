import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayWithStackOpn {
    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        int n = 3;
        System.out.println(buildArray(arr, n));
    }

    static public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            list.add("Push");

            if (target[j] == stack.peek()) {
                j++;
            }else{
                stack.pop();
                list.add("Pop");
            }
           

            if (stack.size() == target.length)
                break;

        }
        return list;
    }
}
