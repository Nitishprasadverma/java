
package recursion.AdityaVermaRecursion;

import java.util.*;

public class LetterCasePermu {

    public static void main(String[] args) {
String s = "a1b2";
List<String> list = new ArrayList<>();

solve(s, "", list);

System.out.print(list);
    }

    public static void solve(String input, String output, List<String> list) {

        if (input.length() == 0) {
            list.add(output);
            return;
        }

        char c = input.charAt(0);

        String remainingChar = input.substring(1);

        if (Character.isLetter(c)) {
            solve(remainingChar, output + Character.toLowerCase(c), list);
            solve(remainingChar, output + Character.toUpperCase(c), list);
        } else {
            solve(remainingChar, output + c, list);
        }

    }

}
