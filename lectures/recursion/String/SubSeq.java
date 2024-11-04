package recursion.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        ArrayList<String> ans = subSeqString("", "aba");
        System.out.println(ans);
        // System.out.println(subSeq1("", "aba", new ArrayList<String>()));
        Set<String> distSubSeq = new HashSet<>();
        countSubSeq("", "aaa", distSubSeq);

        System.out.println(distSubSeq.size());
    }

    static void subSeq(String p, String up) {

        if (up.isEmpty()) {
            
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));

        subSeq(p, up.substring(1));
    }
// list as in argument 
    static ArrayList<String> subSeq1(String p, String up,ArrayList<String> list) {

        if (up.isEmpty()) {
           list.add(p);
           return list;
        }

        char ch = up.charAt(0);
         subSeq1(p + ch, up.substring(1),list);

         subSeq1(p, up.substring(1),list);
         return list;
    }
//list as in local variable declaration
    static ArrayList<String> subSeqString(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqString(p + ch, up.substring(1));
        ArrayList<String> right = subSeqString(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void countSubSeq(String p, String up,  Set<String> set){
if(up.isEmpty()){
    if(!p.isEmpty()){
        set.add(p);
    }
  
    return;
}

char ch = up.charAt(0);

countSubSeq(p+ch, up.substring(1), set);

countSubSeq(p, up.substring(1), set);

    }
}
