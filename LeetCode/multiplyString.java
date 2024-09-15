public class multiplyString {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiplay_strings(num1, num2));
    }

    static String multiplay_strings(String num1, String num2){

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] num3 =   new int [num1.length() + num2.length()];

        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j =  num2.length() - 1; j >= 0; j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = product + num3[pos2];
                num3[pos1] += sum / 10;
                num3[pos2] = sum % 10;
            }
        }

        StringBuilder resultStr = new StringBuilder(); 

        for(int num : num3){
            if(!(resultStr.length() == 0 && num == 0)){
                resultStr.append(num);
            }
        }
        return resultStr.toString();
    }
}


