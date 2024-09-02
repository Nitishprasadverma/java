// import java.util.*;
public class alikeString {
    public static void main(String[] args) {
        
        String s = "textbook";

        System.out.println(isalike(s));
    }

    static boolean isalike(String s){
        String vowels = "aeiouAEIOU";

        int n = s.length();

        int half = n / 2;

        String a = s.substring(0, half);

        String b = s.substring(half);

        int countA = countVowels(a, vowels);

        System.out.println(countA);
        
        int countB = countVowels(b, vowels);
        System.out.println(countB);

        return countA == countB;

    }

    static int countVowels(String str, String vowels){
        int count = 0;
        for(char c : str.toCharArray()){
            if(vowels.indexOf(c) !=-1){
                count++;
            }
        }
        return count;
    }
}
