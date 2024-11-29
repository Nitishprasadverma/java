public class countndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    static String countAndSay(int n) {
        if (n == 1)
            return "1";
       

        String prev = "1";// Start with second term

        for (int i = 2; i <= n; i++) {
            int cnt = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < prev.length(); j++) {

                if (prev.charAt(j) == prev.charAt(j - 1)) {
                    cnt++;
                } else {
                    sb.append(cnt).append(prev.charAt(j - 1)); // append count and digit to the ans;
                    cnt = 1; // reseting the count after one consucstive occurance of digit;
                }

            }
            sb.append(cnt).append(prev.charAt(prev.length() - 1)); // adding the last element of the sequence bcz that
                                                                   // will never enter in else block;

            prev = sb.toString();
        }
        return prev;
    }
}
