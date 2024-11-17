public class excelsheet {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    static String convertToTitle(int columnNumber){
        StringBuilder columnTitle = new StringBuilder();
        while(columnNumber > 0){
           char currentChar = (char) ('A' + (columnNumber - 1) % 26);
           columnTitle.append(currentChar);
           columnNumber = (columnNumber - 1) /26;
        }
        return columnTitle.reverse().toString();
    }
}
