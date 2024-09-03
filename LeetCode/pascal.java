import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number (n):");
        int n = sc.nextInt();
        sc.close();
        System.out.println(pascalRowSum(n));
    }

            static int pascalRowSum(int n){
        return (int) Math.pow(2, n);
    }
}
