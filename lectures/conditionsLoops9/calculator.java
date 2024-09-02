package conditionsLoops9;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("enter operator:");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    ans = num1 / num2;
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            } 
            else if (ch == 'x' || ch == 'X') {
                break;
            }

            else {
                System.out.println("invalid operator !");
            }

            System.out.println(ans);
        }
        sc.close();

    }
}
