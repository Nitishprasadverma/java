package January;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Sixt {

    public static void main(String[] args) {
        // int[] ans = countBits(5);

        // System.out.println(Arrays.toString(ans));
        ArrayList<Integer> bits = new ArrayList<>();
        bits.add(5);
        bits.add(10);
        bits.add(1);
        bits.add(5);
        bits.add(2);

        System.out.println(sumIndicesWithKSetBits(bits, 1));
    }

    public int[] countBitsOPti(int n) {
        int[] bits = new int[n + 1];

        if (n == 0)
            return bits;

        bits[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                bits[i] = bits[i / 2] + 1;
            } else {
                bits[i] = bits[i / 2];
            }
        }
        return bits;

        // for(int i = 0; i <= n; i++){
        // bits[i] = convertToBinary(i);
        // }
        // return bits;
    }

    static public int[] countBits(int n) {

        int[] bits = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            bits[i] = convertToBinary(i);
        }
        return bits;
    }

    static public int convertToBinary(int num) {

        ArrayList<Integer> bits = new ArrayList<>();

        while (num > 0) {
            int bit = num % 2;
            bits.add(bit);
            num = num / 2;
        }
        int numberOfBits = countOneBit(bits);
        return numberOfBits;
    }

    static public int countOneBit(ArrayList<Integer> num) {
        int onesCount = 0;
        for (int bit : num) {
            if (bit == 1) {
                onesCount++;
            }
        }
        return onesCount;
    }

    static public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {

            if (convertToBinary(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    static public int sumIndicesWithKSetBitsopti(List<Integer> nums, int k) {

        int[] arr = countBits(nums.size());

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {

            if (arr[i] == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public int divide(int dividend, int divisor) {

        if (dividend == divisor)
        return 1;
    boolean sign = true;

    if (dividend >= 0 && divisor < 0)
        sign = false;

   else if (dividend <= 0 && divisor > 0)
        sign = false;

    long n = Math.abs((long)dividend);
    long d = Math.abs((long)divisor);

    int ans = 0;
    while (n >= d) {

        int cnt = 0;
        // d * 2^cnt + 1 ->d << cnt + 1
        while (n >= (d << (cnt + 1))) {
            cnt++;
            // ans += 2^cnt;

           
        }
         ans += 1 << cnt;
            n = n - (d << cnt);
    }

    if (ans == (1<<31) && sign == true)
        return Integer.MAX_VALUE;
    if (ans <= (1<< 31) && sign == false)
        return Integer.MIN_VALUE;

    return sign ? ans : (-1 * ans);
    }

}
