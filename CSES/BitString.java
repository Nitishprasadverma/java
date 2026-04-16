import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitString {

    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long result = 1;

        for (int i = 0; i < n; i++) {
            result = (result * 2) % MOD;
        }
        System.out.println(result);
    }
}
