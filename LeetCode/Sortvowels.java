import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sortvowels {
    public static void main(String[] args) {
String s = "lEetcOde";
System.out.println(sortVowels(s));
    }

    static String sortVowels(String s) {

        String sortedVowels = extractAndSortVowels(s);
        StringBuilder result = new StringBuilder(s);
        int j = 0; 
        for(int i =0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                result.setCharAt(i, sortedVowels.charAt(j++));
            }
                
        }

        return result.toString();
    }

    static String extractAndSortVowels(String s) {
        List<Character> vowelsList = new ArrayList<>();

        // checking is it vowerls

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelsList.add(s.charAt(i));
            }
        }
        Collections.sort(vowelsList);

        StringBuilder sb = new StringBuilder();
        for (char c : vowelsList) {
            sb.append(c);
        }
        return sb.toString();
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
