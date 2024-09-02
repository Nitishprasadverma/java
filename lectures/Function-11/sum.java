import java.util.*;

public class sum {
    public static void main(String[] args) {
        sums();
    }
    static void sums(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = in.nextInt();
        System.out.println("Enter num2:");
        int num2 = in.nextInt();
    in.close();
        int sum = num1 + num2;
        System.out.println("The sum is :" + sum);
}
}


