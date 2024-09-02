// import java.util.*;

public class functionOveloading {
    public static void main(String[] args) {
        fun(0);
        fun("nitish");
        
    }

    //function overloading same name but different arguments
    static void fun(int s){
System.out.println(s);
    }
    static void fun(String n){
        System.out.println(n);
    }
}
