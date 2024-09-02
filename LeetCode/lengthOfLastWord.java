// import java.util.*;
public class lengthOfLastWord {
    public static void main(String[] args) {
        String str = "hello world";
        lengthOfLastWords(str);
        String word= "let's";
        System.out.println(word);
    }
static int lengthOfLastWords(String s){
   String [] word = s.split(" ");
   String last_word = word[word.length -1];
   int word_length = last_word.length();
   return word_length;
  
}

}
