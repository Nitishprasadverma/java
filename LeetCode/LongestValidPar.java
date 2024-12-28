public class LongestValidPar {
    public static void main(String[] args) {
        String s = "(()";

        System.out.println(longestValidParentheses(s));
    }

    static int longestValidParentheses(String s) {
        int left = 0, right = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                left++;
            else {
                right++;
            }

            if (left == right) {
                max = Math.max(max, 2 * right);
            } else if (right > left) {
                left = 0;
                right = 0;
            }

        }

        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                left++;
            else {
                right++;
            }

            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }

        }
        return max;
    }

}
