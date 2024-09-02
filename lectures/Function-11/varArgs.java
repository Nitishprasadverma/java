import java.util.*;

public class varArgs {
    public static void main(String[] args) {
        fun(2,3,4,56,34,34,555,5); //vairable length arguments.

        multiple(1, 5, "nitish", "manu");
    }

    static void multiple(int a, int b, String ...s){
        System.out.println("a" +b + Arrays.toString(s));

    }
    static void fun(int ...v){
System.out.println(Arrays.toString(v));
    }
}
