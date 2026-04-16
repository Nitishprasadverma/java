import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GrayCode {
      public static ArrayList<String> graycode(int n) {
        if (n == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        ArrayList<String> prev = graycode(n - 1);
        ArrayList<String> result = new ArrayList<>();

        for (String s : prev) {
            result.add("0" + s);
        }

        for (int i = prev.size() - 1; i >= 0; i--) {
            result.add("1" + prev.get(i));
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> res = graycode(n);

        StringBuilder sb = new StringBuilder();
        for (String s : res) {
            sb.append(s).append("\n");
        }

        System.out.print(sb.toString());
    }
}
