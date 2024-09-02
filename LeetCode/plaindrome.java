// import java.util.*;
public class plaindrome {
    public static void main(String[] args) {
        String ch = "abc";
        System.out.println(plaindromes(ch));
    }

    static boolean plaindromes( String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
               return isPalinDrome(s, start + 1, end) || isPalinDrome(s, start, end -1);
            }

        }
        return true;

    }


    static boolean isPalinDrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
