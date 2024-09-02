// import java.util.*;;
public class equivalent {
    public static void main(String[] args) {
        String[]  word1 = {"abc", "d", "defg"};
       String[] word2 = {"abcddefg"};
String str = "here";
System.out.println(str.toLowerCase()); 
        System.out.println(arrayStringAreEqual(word1, word2));
    }

    static boolean arrayStringAreEqual(String[] word1, String[] word2){
       String str1 = arrayToString(word1);
       String str2 = arrayToString(word2);

       if(str1.equals(str2)){
        return true;
       }
       return false;

    }

    static String arrayToString(String[] array){
        String result = "";
        for(String s:array){
            result += s;
        }
        return result;
    }
}
