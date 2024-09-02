import java.util.*;
public class wordVertically {
    public static void main(String[] args) {
      String s = "HOW ARE YOU";
       System.out.println(printVertically(s));       

    }

    static  List<String> printVertically(String s){
        String[] words = s.split(" ");
        int maxLength = 0;
       //finding the maxlength word for iterating the loop for that amount of time
        for(String word : words){
            if(word.length() > maxLength){
                maxLength = word.length();
            }
        }
         // creating a variable result to add each vertical word
        List<String> result = new ArrayList<>();

        for(int i = 0; i < maxLength; i++){

            // created stringBuilder variable sb for
            StringBuilder sb = new StringBuilder();

            for(String word: words){
                if(i < word.length()){
                    sb.append(word.charAt(i));
                }
                else{
                    sb.append(" ");
                }
            }
            result.add(sb.toString().stripTrailing()); 
        }
        return result;
    }
}
