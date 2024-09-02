import java.util.*;
public class sentancePangram {
    public static void main(String[] args) {
        String sentnce = "thequickbrownfoxjumpsoverthelazzydog";
        System.out.println(checkIfPangram(sentnce));
    }

    static boolean checkIfPangram(String sentence){
     Set<Character> uniqueLetters = new HashSet<>();
     for (char ch : sentence.toCharArray()) {
        uniqueLetters.add(ch);
        if(uniqueLetters.size() == 26){
            return true;
        }
     }
     
     System.out.print(uniqueLetters);
     return uniqueLetters.size() == 26;
     
    }
}
