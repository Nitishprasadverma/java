
import java.util.Stack;

public class LexicographicallySmallest {

    // You are given a string s and a robot that currently holds an empty string t.
    // Apply one of the following operations until s and t are both empty:

    // Remove the first character of a string s and give it to the robot. The robot
    // will append this character to the string t.
    // Remove the last character of a string t and give it to the robot. The robot
    // will write this character on paper.
    // Return the lexicographically smallest string that can be written on the
    // paper.

    // Example 1:

    // Input: s = "zza"
    // Output: "azz"
    // Explanation: Let p denote the written string.
    // Initially p="", s="zza", t="".
    // Perform first operation three times p="", s="", t="zza".
    // Perform second operation three times p="azz", s="", t="".

    public String robotWithString(String s) {
        int n = s.length();
        char[] smllestChar = new char[n];

        smllestChar[n - 1] = s.charAt(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            smllestChar[i] = (char) Math.min(s.charAt(i), smllestChar[i + 1]);
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            stack.push(s.charAt(i));
            char minChar = (i + 1 < n) ? smllestChar[i + 1] : s.charAt(i);

            while (!stack.isEmpty() && stack.peek() <= minChar) {
                sb.append(stack.pop());
                i++;

            }
        }
        // If stack is still left with some char then simply append it at the end;

        while (!stack.isEmpty()) {
            sb.append(stack.pop());

        }

        return sb.toString();

    }
}
