import java.util.ArrayList;

public class phone {
    public static void main(String[] args) {
        System.out.println(phoneNumber("23"));
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
