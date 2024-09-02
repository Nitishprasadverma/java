package LinerSearch;
// import java.util.*;

public class searchChar {
    public static void main(String[] args) {

        String name = "nitish";
        char target = 'g';
        boolean ans = SearchChar(name, target);
        System.out.println(ans);
    }

    static boolean SearchChar(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
