
package march;

public class Eight {
    public static void main(String[] args) {
        String blocks = "BWWWBB";
        int k = 6;
        System.out.println(minimumRecolors(blocks, k));
    }

    // Brute Force approach
    static public int minimumRecolors(String blocks, int k) {
        int n = blocks.length() - k;

        int reslt = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            int w = 0;
            for (int j = i; j - i + 1 < k; j++) {
                if (blocks.charAt(j) == 'W')
                    w++;
            }
            reslt = Math.min(reslt, w);
        }
        return reslt;
    }

    // optimal approach

    static public int minimumRecolorsOp(String str, int k) {
        int i = 0;
        int j = 0;

        int minOp = Integer.MAX_VALUE;
        int w = 0;
        while (j < str.length()) {
            if (str.charAt(j) == 'W')
                w++;
            if (j - i + 1 == k) {
                minOp = Math.min(minOp, w);

                if (str.charAt(i) == 'W') {
                    w--;
                }
                i++;
            }
            j++;
        }
        return minOp;
    }
}
