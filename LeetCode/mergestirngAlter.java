// import java.util.*;
public class mergestirngAlter {
    public static void main(String[] args) {
        String word1  = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    static String mergeAlternately(String word1, String word2){
     
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length()){

            if(i < word1.length()){
                result.append(word1.charAt(i));
            }

            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
             
            i++;
        }
return result.toString();
    }
}
