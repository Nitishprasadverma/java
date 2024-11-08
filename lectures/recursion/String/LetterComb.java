package recursion.String;

import java.util.ArrayList;

public class LetterComb {
    public static void main(String[] args) {
        // phoneNumberCombi("", "12");
        System.out.println(phoneNumberCombiList("", "12"));
        System.out.println(phoneNumberCombiCount("", "22233"));

        System.out.println(phoneNumber("23"));

    }

    static void phoneNumberCombi(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);
            phoneNumberCombi(p + ch, up.substring(1));
        }
    }


    static int phoneNumberCombiCount(String p, String up) {
        if (up.isEmpty()) {
            // System.out.println(p);
            return 1;
        }
        int digit = up.charAt(0) - '0';
int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);
          count = count +  phoneNumberCombiCount(p + ch, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> phoneNumberCombiList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '1';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);
            ans.addAll(phoneNumberCombiList(p + ch, up.substring(1)));
            ;
        }
        return ans;
    }

    static ArrayList<String> phoneNumber( String up){
        

        if(up.isEmpty()){
           return new ArrayList<>();
            
        }

        String[] digitToChars ={"","", "abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        char currentDigit = up.charAt(0);

        String charsForDigit = digitToChars[currentDigit - '0'];

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < charsForDigit.length(); i++) {
           ArrayList<String> subCombinations = phoneNumber(up.substring(1));

           if(subCombinations.isEmpty()){
            ans.add(String.valueOf(charsForDigit.charAt(i)));
           }else{
            for (String subCombination : subCombinations) {
                ans.add(charsForDigit.charAt(i) + subCombination);
               }
           }
           
        }
return ans;
    }
}
