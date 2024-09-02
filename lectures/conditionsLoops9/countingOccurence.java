package conditionsLoops9;
import java.util.*;
public class countingOccurence {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter two or more than two digit numbers:");
        int n = sc.nextInt();
        System.out.println("Enter a digit which you wanna to count occurence in above entered number !");
        int occurenceDigit = sc.nextInt();

        int count = 0;
        while (n>0) {
            int rem = n % 10;
            if(rem == occurenceDigit){
                count++;
            }
            n = n / 10;
        }
      System.out.println(count);
      sc.close();
    }
}
