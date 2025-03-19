import java.util.HashMap;

public class minWindowSubs {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }

    static public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;
        int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            map.put(ch, 0);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, 0);
        }

        for (int i = 0; i < m; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        while (r < n) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                if (map.get(rightChar) > 0)
                    cnt++;
                map.put(rightChar, map.get(rightChar) - 1);
            }

            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;

                }
                if (map.containsKey(s.charAt(l))) {
                    map.put(s.charAt(l), map.get(s.charAt(l)) + 1);

                    if (map.get(s.charAt(l)) > 0)
                        cnt--;
                }

                l++;
            }

            r = r + 1;
        }
        return sIndex == -1 ? "" : s.substring(sIndex, minLen + sIndex);

    }
}
