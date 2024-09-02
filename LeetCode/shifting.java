public class shifting {
    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3,5,9};
        System.out.println(shiftingLetters(s, shifts));
    }

    static String shiftingLetters(String s, int[] shifts){
        int n = s.length();
        char[] result = new char[n];

        long totalShifts = 0;

        for(int i = n - 1; i >=0; i--){
            totalShifts += shifts[i];

            totalShifts %= 26;
            result[i] = (char)('a' + (s.charAt(i) - 'a' + totalShifts ) % 26);
        }
        return new String(result);
    }
}
