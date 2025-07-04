package July25;

//https://leetcode.com/problems/find-the-original-typed-string-i/description/
public class OrginalTypedString1 {
      public int possibleStringCount(String word) {
        
        
         int count = 0;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            }
        }

        return count + 1;
    }
}
