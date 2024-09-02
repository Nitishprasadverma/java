import java.util.*;

public class armStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("Enter a number !");
        int n = in.nextInt();
        int digit = String.valueOf(n).length();
        boolean ans = fun(n, digit);
        System.out.println(ans);

     
in.close();
    }

    static boolean fun(int n, int digit) {
        int total = 0;
        int orginial = n;
        while (n > 0) {
            int rem = n % 10;
            Double sq = Math.pow(rem, digit);
            total += sq;
            n = n / 10;
        }
        if (orginial == total) {
            return true;
        } else {
            return false;
        }

    }
}
