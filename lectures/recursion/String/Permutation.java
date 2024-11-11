package recursion.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args){
// permuatation("", "abc");
ArrayList<String> ans = permuatationList("", "123");
System.out.println(ans);
// System.out.println(permuatationCount("", "123"));
    }

    static void permuatation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

       char ch = up.charAt(0);
       for(int i = 0; i <= p.length(); i++){
        String f = p.substring(0, i);
        String s = p.substring(i, p.length());
        permuatation(f + ch + s, up.substring(1));
       }
    }

    static ArrayList<String> permuatationList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

       char ch = up.charAt(0);
       ArrayList<String> ans = new ArrayList<>();
       for(int i = 0; i <= p.length(); i++){
        String f = p.substring(0, i);
        String s = p.substring(i, p.length());
        ans.addAll(permuatationList( f + ch + s, up.substring(1)));
       
       }
       return ans;
    }

    static int permuatationCount(String p, String up){
        if(up.isEmpty()){
          
          
            return 1;
        }

       char ch = up.charAt(0);
      int count = 0;
       for(int i = 0; i <= p.length(); i++){
        String f = p.substring(0, i);
        String s = p.substring(i, p.length());
      count = count + permuatationCount(f + ch + s, up.substring(1));
       
       }
       return count;
    }
}
