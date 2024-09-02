import java.util.ArrayList;
import java.util.List;
public class camelCase {
    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FoBaT";
        List<Boolean> result = camelCaseMatch(queries, pattern);
        System.out.println(result);
    }

    static List<Boolean>  camelCaseMatch(String[] queries, String pattern){
      List<Boolean> result = new ArrayList<>();
      for(String query : queries){
        result.add(isMatch(query, pattern));
      }
      return result;
    }

    static boolean isMatch(String query, String pattern){
        int pLen = pattern.length();
        int qLen = query.length();
        int pIndex = 0;

        for(int qIndex = 0; qIndex < qLen; qIndex++){

            if (pIndex < pLen && query.charAt(qIndex) == pattern.charAt(pIndex)) {
                pIndex++;
            }
            else if(Character.isUpperCase(query.charAt(qIndex))){
                return false;
            }
        }

        return pIndex == pLen;
    }
}
