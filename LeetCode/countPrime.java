import java.util.Arrays;

public class countPrime {

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    static int countPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
            Arrays.fill(prime, true);

            prime[0] = false;
            prime[1] = false;

            for(int i = 2; i * i <= n; i++){
                for(int j = i*i; j <=n; j +=i){
                    prime[j] = false;
                }
            }
            int cnt = 0;
            for(boolean isprime : prime){
                if(isprime) cnt++;
            }
            return cnt;
    }


    // faster than abbove 
    static int countPrime1(int n){
        if (n == 0 || n == 1) return 0;

        boolean[] isPrime = new boolean[n+1];

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (!isPrime[i]){
                for (int j = i*i; j <= n; j+=i){
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++){
            if (!isPrime[i]) count++;
        }

        return count;
    }
}