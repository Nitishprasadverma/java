// import java.util.*;
public class interpret {
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interprets(str));
    }
    static String interprets(String command) {
        // StringBuilder str = new StringBuilder();
        // for(int i = 0; i < command.length(); i++){
        //     char ch = command.charAt(i);
        //     if(ch == ()){
        //         str.append(o);
        //     }
        //    if(ch == (al)){
        //         str.append(al);
        //     }
        //     if(ch == G){
        //         str.append(G);
        //     }

        // }
        // return str.toString();
        
      String str = command;
      System.out.println(str);

       return str.replace("()" , "o");
        
    }
}
