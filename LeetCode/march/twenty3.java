package march;

import java.util.Stack;

public class twenty3 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    static public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                stringStack.push(currentString.toString());
                numberStack.push(num);
                currentString = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                int rTime = numberStack.pop();
                StringBuilder storedString = new StringBuilder(stringStack.pop());

                for (int i = 0; i < rTime; i++) {
                    storedString.append(currentString);
                }
                currentString = storedString;
            } else {
                currentString.append(ch);
            }

        }

        return currentString.toString();
    }
}
