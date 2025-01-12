import java.util.*;;
public class Factor {
    public static void main(String[] args) {
        int n = 7, k= 2;
        System.out.println(kthFactor(n, k));
    }

    static public  List<Integer> kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        
        for(int i =1; i <= n;i++){
            if(n % i == 0) factors.add(i);
        }
        // System.out.println(factors.get(0));

        if(factors.size() >= k) {
            System.out.println(factors.get(k -1));
        }
        return factors;
    }
}
