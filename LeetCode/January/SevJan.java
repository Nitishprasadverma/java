package January;

import java.util.ArrayList;
import java.util.List;

public class SevJan {
     public static void main(String[] args) {
       String[] words = {"mass","as","hero","superhero"};
       System.out.println(stringMatching(words));
     }

   static  public List<String> stringMatching(String[] words) {
        List<String> st = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length;j++){
                if(words[j].contains(words[i]) && i != j){
                    st.add(words[i]);
                    break;
                }
            }
        }
       System.out.print(st);
         return st;
    }
}
