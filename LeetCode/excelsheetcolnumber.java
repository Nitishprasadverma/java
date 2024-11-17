public class excelsheetcolnumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    static int titleToNumber(String columnTitle) {
        int sum = 0;
        int p = 0;
        int n = columnTitle.length();

        for (int i = n - 1; i >= 0; i--) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            sum = sum + (int) Math.pow(26, p++) * charValue;
            ;
        }
        return sum;
    }
}
