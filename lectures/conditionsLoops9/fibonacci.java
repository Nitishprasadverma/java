package conditionsLoops9;
import java.util.*;
public class fibonacci {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.close();
    int a = 0;
    int b = 1;
    int count = 2;
    while (count <=n) {
        int temp = b;
        // System.out.println(a);
       b = b + a;
       a = temp;
       count++;
    }
System.out.println(b);
   } 
}