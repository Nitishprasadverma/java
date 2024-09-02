// s
public class reverseInteger {
    public static void main(String[] args) {
        int num = 234;
        System.out.println(reverseDigits(num));
    }

    static int reverseDigits(int x){
        int reversedNum = 0;
        while(x!=0){
         int digit = x % 10;
         reversedNum = reversedNum * 10 + digit;
        }
        System.out.println(reversedNum);
        return reversedNum;
     }
    
}
