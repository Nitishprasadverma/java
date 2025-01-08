package January;

public class Eigth {
    public static void main(String[] args) {
        String[] words = { "pa", "papa", "ma", "mama" };
        System.out.println(countPrefixSuffixPairs(words));

    }

    static public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){


            for(int j = i + 1; j < words.length; j++){
               
               if( isPrefixAndSuffix(words[i], words[j])) {
                count++;
               };
            }
        }
    return count;
    }

    static private boolean isPrefixAndSuffix(String num1, String num2) {

       
      if(num2.startsWith(num1) && num2.endsWith(num1) ) return true;


      return false;
    }
}
