package July25;


//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/?envType=daily-question&envId=2025-07-03
public class StringGameOne3 {
     public char kthCharacter(int k) {
        // String word = "a";

        // while(word.length() < k){
        //     String next = "";

        //     for(char ch : word.toCharArray()){
        //        next +=(char) (((ch - 'a' + 1) % 26) + 'a'); 
        //     }

        //     word += next;
        // }

        // return word.charAt(k - 1);




        StringBuilder word = new StringBuilder("a");

     

        while(word.length() < k){
           
            int len  = word.length();
             
            for(int i = 0; i < len && word.length() < k; i++){
                char ch = word.charAt(i);
                char nextChar = (char)(((ch - 'a' + 1) % 26) + 'a');
                word.append(nextChar);
            }
        }
         return word.charAt(k - 1);
    }
}
