public class leet2843 {
    public int countSymmetricIntegers(int low, int high) {
        // int count = 0;

        // for(int i = low; i <= high; i++){

        // int digits = countDigits(i);

        // if(digits % 2 == 0){
        // if(isSymmetric(i,digits))
        // count++;
        // }
        // }
        // return count;

        int count = 0;

        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);

            if (s.length() % 2 == 0 && isSymmetric(s))
                count++;
        }
        return count;
    }

    // public static int countDigits(int x) {
    // return (x > 0) ? (int)(Math.log10(x) + 1) : 1;
    // }

    // public boolean isSymmetric(int num, int digits){
    // String s = String.valueOf(num);
    // int sumFirstHalf = 0, sumSecondHalf = 0;
    // for (int i = 0; i < digits / 2; i++) {
    // sumFirstHalf += s.charAt(i) - '0'; // Convert char to int
    // sumSecondHalf += s.charAt(digits / 2 + i) - '0';
    // }
    // return sumFirstHalf == sumSecondHalf;

    // }

    public boolean isSymmetric(String s) {
        int mid = s.length() / 2;
        int sumFirstHalf = 0, sumSecondHalf = 0;
        for (int i = 0; i < mid; i++) {
            sumFirstHalf += s.charAt(i) - '0'; // Convert char to int
            sumSecondHalf += s.charAt(s.length() - mid + i) - '0';
        }
        return sumFirstHalf == sumSecondHalf;

    }
}
