
import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        System.out.println(validAnagram("anagram", "nagaram"));
    }
    static boolean validAnagram(String s, String t){
 Map<Character, Integer> count = new HashMap<>();
        for(char x:s.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        for(char x:t.toCharArray()){
          count.put(x, count.getOrDefault(x, 0) - 1);
        }

        for(int value: count.values()){
            if(value!= 0){
                return false;
            }
        }
        return true;

    }
}
