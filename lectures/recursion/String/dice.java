package recursion.String;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        diceC("", 4);
        System.out.println(diceList("", 4));
    }

    static void diceC(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceC(p + i, target - i);
        }
    }
    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceC(p + i, target - i);
        }
    }


    static ArrayList<String> diceListFace(String p, int target,int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(diceListFace(p + i, target - i,face));
            ;
        }
        return ans;
    }
    static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceList(p + i, target - i));
            ;
        }
        return ans;
    }
}
