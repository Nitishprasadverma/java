import java.util.ArrayList;

public class nextgreater {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12));
    }

    static int nextGreaterElement(int n) {
        String num = Integer.toString(n);
        ArrayList<String> list = permuatationList("", num);
        ArrayList<Integer> intList = new ArrayList<>();
        int greater = 0;
        for (String str : list) {
            intList.add(Integer.parseInt(str));

            for (int i = 0; i < intList.size(); i++) {
                if (intList.get(i) > greater) {
                    greater = intList.get(i);
                }
            }

        }
        return greater;
    }

    static ArrayList<String> permuatationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permuatationList(f + ch + s, up.substring(1)));

        }
        return ans;
    }

}
