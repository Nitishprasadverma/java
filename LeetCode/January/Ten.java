package January;

import java.util.*;

public class Ten {
    public static void main(String[] args) {
String[] word1= {"amazon","apple","facebook","google","leetcode"};

String[] word2 = {"e","o"};

System.out.println(wordSubsets(word1, word2));
    }

   static public List<String> wordSubsets(String[] words1, String[] words2) {

        HashMap<Character, Integer> maxFreq = new HashMap<>();

        for (String word : words2) {
            HashMap<Character, Integer> freq = getFrequency(word);

            for (char c : freq.keySet()) {
                maxFreq.put(c, Math.max(maxFreq.getOrDefault(c, 0), freq.get(c)));
            }
        }


        List<String> ans = new ArrayList<>();

        for(String word : words1){
            HashMap<Character,Integer> word1Freq = getFrequency(word);

            if(isUniversal(word1Freq,maxFreq)){
                ans.add(word);
            }
        }
        return ans;
    }

    private static HashMap<Character, Integer> getFrequency(String word) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

   static private boolean isUniversal(HashMap<Character,Integer> word1Freq, HashMap<Character,Integer> maxFreq){
        for(char c : maxFreq.keySet()){
            if(word1Freq.getOrDefault(c, 0) < maxFreq.get(c)){
                return false;
            }
        }
        return true;
    }

}
