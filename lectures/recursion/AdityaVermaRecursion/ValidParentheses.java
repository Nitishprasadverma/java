package recursion.AdityaVermaRecursion;
import java.util.*;

public class ValidParentheses{

public static void main(String[] args) {
    
    int open = 3, close = 3;
    List<String> list = new ArrayList<>();

    solve(open, close, " " , list);

    System.out.println(list);
    
}

public static void solve(int open, int close, String output, List<String> list){

    if(open == 0 && close == 0){
        list.add(output);
        return;
    }

    if(open > 0){

        solve(open - 1, close, output + "(", list);
    }

    if(open < close){
        solve(open, close - 1, output + ")", list);
    }
}

}