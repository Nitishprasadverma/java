package recursion.String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
        ArrayList<String> ans = subSeqString("", "abc");
        System.out.println(ans);
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
}
