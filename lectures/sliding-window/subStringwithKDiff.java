import java.util.HashMap;

public class subStringwithKDiff {
    public static void main(String[] args) {

    }

    // BruteForce
    public int subStringsWithKDistinctCharater(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.clear();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                if (map.size() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }


    //Better Approach
    public int subStringsWithKDistinctCharaterBetter(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while (r <= s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            while (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }

            if(map.size() <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }

    public int subStringsWithKDistinctCharaterOptimal(String s, int k) {
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while (r <= s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            if (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);

                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }

            if(map.size() <= k){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }


}
