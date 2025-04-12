import java.util.*;

public class pod3272 {

    public static void main(String[] args) {
        int n = 3, k = 5;
        System.out.println(countGoodIntegers(n, k));
    }
   static public long countGoodIntegers(int n, int k) {
        Set<String> st = new HashSet<>();

        int d = (n + 1) / 2;
       
        int start =(int) Math.pow(10, d - 1);
        int end = (int) Math.pow(10, d) - 1;

        //genrating palindromes

        for(int num = start ; num <= end; num++){
            String leftHalf = String.valueOf(num);
            String full = "";

            if( n % 2 == 0){
                StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();
                full = leftHalf + rightHalf.toString();

            }else{
                StringBuilder rightHalf = new StringBuilder(leftHalf.substring(0,d - 1)).reverse();
                full = leftHalf + rightHalf.toString();
            }

            long number = Long.parseLong(full);

            if(number % k != 0) continue;

            char[] chars = full.toCharArray();
            Arrays.sort(chars);
            st.add(new String(chars));
        }

        long[] fact = new long[11];
        fact[0] = 1;
        for(int i  = 1; i < 11; i++){
            fact[i] = fact[i - 1] * i;
        }

        int reslt = 0;

        for(String s : st){
            int[] count = new int[10];
            for(char ch : s.toCharArray()){
                count[ch - '0']++;
            }

            int totalDigits = s.length();
            int zeroDigits = count[0];
            int nonZeroDigits = totalDigits - zeroDigits;

            long permu = nonZeroDigits * fact[totalDigits - 1];

            for(int i = 0; i < 10; i++){
                permu /= fact[count[i]];
            } 

            reslt += permu;
        }
return reslt;
    }
    
}