public class countingdigitThatDivide {
    public static void main(String[] args) {
        System.out.println(countDigits(12));
    }
    static int countDigits(int num){
        int temp = num;
        int count = 0;
        while(num > 0){
            int lastDigit = num % 10;
        if(temp % lastDigit == 0){
            count++;
        }
        num = num / 10;
        }
        return count;
        }
}
