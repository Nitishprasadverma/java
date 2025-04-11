
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

    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        Map<Character, Integer> mp = new HashMap<>();

        // precomputation to find the index of neext consonant

        int[] nextCons = new int[n];
        int lastConsIdx = n;

        for (int i = n - 1; i >= 0; i--) {
            nextCons[i] = lastConsIdx;
            if (!isVowel(word.charAt(i))) {
                lastConsIdx = i;
            }
        }
        int i = 0, j = 0;
        long count = 0;
        int cons = 0;
        while (j < n) {
            char ch = word.charAt(j);
            if (isVowel(ch)) {
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            } else {
                cons++;
            }

            while (cons > k) {
                char ci = word.charAt(i);
                if (isVowel(ci)) {
                    mp.put(ci, mp.get(ci) - 1);
                    if (mp.get(ci) == 0) {
                        mp.remove(ci);
                    }
                } else {
                    cons--;
                }
                i++;
            }

            while (i < n && mp.size() == 5 && cons == k) {
                int idx = nextCons[j];
                count += idx - j;

                char ci = word.charAt(i);
                if (isVowel(ci)) {
                    mp.put(ci, mp.get(ci) - 1);

                    if (mp.get(ci) == 0) {
                        mp.remove(ci);
                    }
                } else {
                    cons--;
                }
                i++;
            }
            j++;
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
