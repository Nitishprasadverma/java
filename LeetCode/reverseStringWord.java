// import java.util.*;
public class reverseStringWord {
    public static void main(String[] args) {
        String sentence = "Let's take LeetCode contest";

        System.out.println(reverseWord(sentence));
    }

    static String reverseWord(String s){
        String [] Str = s.split(" ");
        StringBuilder builder = new StringBuilder();
        // String word ="";

        // for(int i = 0; i < Str.length; i++){

        //   word = reverse(Str[i]);
        //   builder.append(word ).append(" ");
        
        // }

        // return builder.toString().trim();



        for (String word : Str) {
            builder.append(new StringBuilder(word).reverse().toString()).append(" ");  //Built-in stringbuilder () method for reverse a word.
        }

        return builder.toString().trim();
    }

    static String reverse(String word){
        String orginal = word;
        String reversed ="";
        for(int i = orginal.length() - 1; i >=0; i--){
            reversed += orginal.charAt(i);
        }
        return reversed;
    }
}
