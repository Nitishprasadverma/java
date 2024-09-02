import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        System.out.println(Arrays.toString(plusone(arr)));
    }

    static int[] plusone(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
    }

}
