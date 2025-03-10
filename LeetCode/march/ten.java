
package march;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ten {
    public static void main(String[] args) {

    }

    public int countVowelSubstrings(String word) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            Map<Character, Integer> vowelCount = new HashMap<>();
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);

                // if character is not vowel then reset the window and start new window
                if (!vowels.contains(c))
                    break;

                // ADd vowels to the map and update count
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
                // if all 5vowels are present in the window , count the substring
                if (vowelCount.size() == 5)
                    count++;
            }
        }
        return count;
    }
}
