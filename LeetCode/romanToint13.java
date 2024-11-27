public class romanToint13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int sum = 0;
        int index = 0;

        while (index < s.length() - 1) {
            if (cross(s.charAt(index)) >= cross(s.charAt(index + 1))) {
                sum += cross(s.charAt(index));
            } else {
                sum -= cross(s.charAt(index));
            }
            index++;

        }
        sum += cross(s.charAt(index));
        return sum;
    }

    static int cross(char c) {
        int num = 0;
        if (c == 'I') {
            num = 1;
        } else if (c == 'V') {
            num = 5;
        } else if (c == 'X') {
            num = 10;
        } else if (c == 'L') {
            num = 50;
        } else if (c == 'C') {
            num = 100;
        } else if (c == 'D') {
            num = 500;
        } else {
            num = 1000;
        }
        return num;
    }
}
