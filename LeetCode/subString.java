// import java.util.*;
public class subString {
    public static void main(String[] args) {
        String[] str = {"a","a","a"};
        String word = "ab";
        System.out.println(numOfStrings(str, word));
    }

    static int numOfStrings(String[] patterns, String word){
       
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
