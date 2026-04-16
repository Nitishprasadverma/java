import java.io.*;
import java.util.*;
public class CoinPiles {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder  sb  = new StringBuilder();

        while(t-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if((a + b) % 3 == 0 && Math.max(a,b) <= 2* Math.min(a, b)){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
