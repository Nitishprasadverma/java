package January;

import java.util.HashMap;
import java.util.Map;

class Fourteen {

    public static void main(String[] args) {

    }

    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            // char key = entry.getKey();
            int value = entry.getValue();

            while (value >= 3) {
                count -= 2;
            }
        }

        return count;
    }

    // public int[] findThePrefixCommonArray(int[] A, int[] B) {

    // }

}