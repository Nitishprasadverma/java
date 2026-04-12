package recursion.AdityaVermaRecursion;
import java.util.*;
public class NbitBinaryNumber {
    public static void main(String[] args) {
        int n = 3;

        ArrayList<String> list = new ArrayList<>();

        solve(0, 0, n, "", list);

        System.out.println(list);
    }

    public static void solve(int ones, int zeros, int n, String output, ArrayList<String> list){
        
        if(n == 0){
            list.add(output);
            return;
        }
        solve(ones + 1, zeros, n - 1, output + "1", list);
        if(ones > zeros){
            solve(ones, zeros + 1, n- 1, output + "0", list);
              
        }
          
    

    }
}
