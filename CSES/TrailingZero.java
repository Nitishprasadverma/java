import java.io.*;

public class TrailingZero {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        System.out.println(count);
    }
}