import java.util.ArrayList;
import java.util.List;

public class peak2951 {
    public static void main(String[] args) {
        int[] mountain = { 1, 4, 3, 8, 5 };
        System.out.println(findPeaks(mountain));
    }

    static List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {

            if (i == mountain.length - 1)
                return ans;
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
