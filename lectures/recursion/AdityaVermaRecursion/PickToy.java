
package recursion.AdityaVermaRecursion;
import java.util.HashMap;

public class PickToy {
    
     /*A toy shop has toys arranged in a row. The row is represented by a string s consisting of lowercase letters 'a' to 'z', where each letter represents a type of toy.

A child wants to buy toys under the following rules:

The toys selected must form a contiguous segment of the row.
The child can buy toys of at most 2 different types.
The child may buy any number of toys as long as the above conditions are satisfied.

Return the maximum number of toys the child can buy. */
    public int pickMaxToy(String s){

        int i  =0 , j =0;
        int n = s.length();

        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = -1;
        while(j < n){

            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() > 2){
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                i++;

            }
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }

        return maxLen;

    }
}
