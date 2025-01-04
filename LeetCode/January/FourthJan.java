package January;


import java.util.*;
public class FourthJan {
    public static void main(String[] args) {
        
    }

   static public int countPalindromicSubsequence(String s) {
        int n = s.length();

        Map<Character, int[] > firstLast = new HashMap<>();


        // storing the first and last index of the every character in string
        for(int i = 0; i < n; i++){
            char c  = s.charAt(i);
            if(!firstLast.containsKey(c)){
                firstLast.put(c, new int[]{i,i});
            }else{
                firstLast.get(c)[i] = i; 
            }
        }

        //find qunique element count in range
        int count = 0;
        for(Map.Entry<Character, int[]> entery : firstLast.entrySet()){

            int[] range = entery.getValue();

            if(range[0] == range[1]) continue;

            Set<Character> quniqueChar = new HashSet<>();


            for(int i = range[0] + 1; i < range[1]; i++){
                quniqueChar.add(s.charAt(i));
            }

            count += quniqueChar.size();
        }
        return count;

    }
}
