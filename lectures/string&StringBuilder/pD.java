// import java.util.*;
public class pD {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal:";
       System.out.println(plainDroms(str));
    }
    static boolean plainDroms(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       System.out.println(cleaned);
        int start = 0;
        int end = cleaned.length() - 1;
        while (start < end) {
            char star = cleaned.charAt(start);
            char en = cleaned.charAt(cleaned.length() - 1 - start);
            if (star != en) {
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }

}



