package January;
import java.util.*;
public class Twelve {
    public static void main(String[] args) {
        int n = 12, k = 3;
        System.out.println(kthFactor(n, k));
    }

    static public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        
        for(int i =1; i <= n;i++){
            if(n % i == 0) factors.add(i);
        }

        if( factors.size() < n) return factors.get(k);
        return -1;
    }
}
