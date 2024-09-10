public class EqualDigit {
    public static void main(String[] args) {
        String num = "030";
        
       System.out.println(ans(num));

    }

    static boolean ans(String num){
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            if(digitCount(i, num) == Character.getNumericValue(num.charAt(i))){
               count++;
            }

        }
       return (count == num.length());

    }
    static int digitCount(int digit, String num){
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            if((char)(digit+'0') == num.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
