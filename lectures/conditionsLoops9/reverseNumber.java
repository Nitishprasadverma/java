package conditionsLoops9;
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     sc.close();
        //Method 1


        // String num = "";
        // while (n > 0) {
        //     int rem = n % 10;
        //     String convertstr = Integer.toString(rem);
        //     num = num.concat(convertstr);

        //     n = n / 10;
        // }
        // System.out.println(num);


        // Method - 2
int reverseNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit; 
            n = n / 10;
        }
        System.out.println(reverseNum);
    }
}