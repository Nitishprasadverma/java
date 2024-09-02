// import java.util.*;;
public class multiplayString {
    public static void main(String[] args) {
        String num1 ="5";
        String num2 ="5";
        
        System.out.println(multiply(num1, num2));
    }

    static String multiply(String num1, String num2) {
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        System.out.println( num4);
        int num5 = num3 * num4;
        
       return Integer.toString(num5);
    }
}
