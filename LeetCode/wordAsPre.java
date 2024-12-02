public class wordAsPre {
   public static void main(String[] args) {
    String sentence = "i love eating burger";
    String word = "burg";
    ;
    System.out.println(isPrefixOfWord(sentence, word));
   } 
   static int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");

        for(int i = 0; i < str.length; i++){
            if(str[i].startsWith(searchWord)){
                return i + 1;
            }
        }
        return -1;
   }
}
