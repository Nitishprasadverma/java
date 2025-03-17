import java.util.HashMap;

public class longestRepeating {
    public static void main(String[] args) {
        String s = "ABAAABC";
        int k = 2;
        System.out.println(characterReplacementBetter(s, k));
    }

    // Brute force
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>(26);
            for (int j = 0; j < s.length(); j++) {

                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));

                int chnages = (j - i + 1) - maxFreq;

                if (chnages <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    // Better

    static public int characterReplacementBetter(String s, int k) {
        int l = 0, r = 0, maxLen = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>(26);
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            while ((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }

    // Optimal

    public int characterReplacementOptimal(String s, int k) {
        int l = 0, r = 0, maxLen = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>(26);
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            if ((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            if ((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }
}
