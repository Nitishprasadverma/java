// import java.util.*;
public class ipAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
    //   char sh = 'a';
        System.out.println(defangIPaddr(address));
    }

    static String defangIPaddr(String address){
       String str = address.replace(".", "[.]");
        return str;

    }
}
