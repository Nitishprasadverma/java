
package recursion.AdityaVermaRecursion;
import java.util.*;

public class PermutaionCaseChange {
    public static void main(String[] args) {
        
        String input = "ab";
        ArrayList<String> list = new ArrayList<>();
        solve(input, list, "");
        System.out.println(list);
    }

   public static void solve(String input, ArrayList<String> list, String output ){
      if(input.length() == 0){

        list.add(output);
        return ;
      }

      String ch =  ("" + input.charAt(0)).toLowerCase();
      String ch1 = ("" + input.charAt(0)).toUpperCase();

      input = input.substring(1 );

      solve(input, list, output + ch);
      solve(input, list, output + ch1);

    }
}
