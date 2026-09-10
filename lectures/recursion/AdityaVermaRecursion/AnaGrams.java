package recursion.AdityaVermaRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnaGrams {
     public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int  n = s.length();
        int k = p.length();
        if (k > n) return list;
        int i = 0, j =0;

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        for(char ch : p.toCharArray()){
            pFreq[ch - 'a']++;
        }

        while(j < n){

            winFreq[s.charAt(j) - 'a']++;

            if(j  -i + 1 < k){
                j++;
            }

           else if(j - i + 1 == k){

                if(Arrays.equals(pFreq, winFreq)){
                    list.add(i);
                }

                winFreq[s.charAt(i) - 'a']--;

                i++;
                j++;
            }

        }
return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd",  p = "abc";
        
        System.out.println(findAnagrams(s, p));
    }
}
