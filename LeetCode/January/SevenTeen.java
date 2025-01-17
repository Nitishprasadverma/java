package January;

public class SevenTeen {
    public static void main(String[] args) {
        System.out.println(minimizeXor(0, 3));
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int cnt = 0;
        int[] freq = new int[A.length + 1];
        int[] ans = new int[B.length];
        for (int i = 0; i < A.length; i++) {

            if (++freq[A[i]] == 2)
                cnt++;
            if (++freq[B[i]] == 2)
                cnt++;
            ans[i] = cnt;
        }
        return ans;
    }

    static public int[] countBitsOPti(int n) {
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

    static public int minimizeXor(int num1, int num2) {

        int num1Bits = countBits(num2); // Get the number of set bits in num2

        int reslt = 0;

        for (int i = 31; i >= 0 && num1Bits > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                reslt |= (1 << i);
                num1Bits--;
            }
        }

        for (int i = 0; i < 32 && num1Bits > 0; i++) {
            if ((reslt & (1 << i)) == 0) {
                reslt |= (1 << i);
                num1Bits--;
            }
        }
        return reslt;
    }

    static public int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is 1
            n >>= 1; // Right-shift n by 1
        }
        return count;
    }

    public boolean doesValidArrayExist(int[] derived) {
        int reslt = 0;
        for (int num : derived)
            reslt ^= num;

        return (reslt == 0);
    }

    public int xorAllNums(int[] nums1, int[] nums2) {
        int c1 = nums1.length;
        int c2 = nums2.length;
        int x1 = 0, x2 = 0;

        if (c1 % 2 != 0) {
            for (int num : nums2) {
                x2 ^= num;
            }
        }
        if (c2 % 2 != 0) {
            for (int num : nums1) {
                x1 ^= num;
            }
        }
        return x1 ^ x2;
    }
}
