public class leet1837 {

    public int sumBase(int n, int k) {
        String s = convertIntoGivenBase(n, k);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public String convertIntoGivenBase(int num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % k;
            sb.append(rem);
            num = num / k;
        }

        return sb.reverse().toString();
    }
}