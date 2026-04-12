import java.util.*;

public class Repetiton {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 1, len = 1;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            len = Math.max(count, len);

        }
        System.out.println(len);
    }

}