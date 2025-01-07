package January;

public class Sixjan {
    public static void main(String[] args) {

    }

    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int cnt = 0;
        int opn = 0;

        for (int i = 0; i < boxes.length(); i++) {
            ans[i] = opn;
            cnt = (boxes.charAt(i) == '1') ? 1 : 0;
            opn += cnt;
        }

        opn = 0;
        cnt = 0;
        for (int i = boxes.length() - 1; i <= 0; i++) {
            ans[i] = opn;
            cnt = (boxes.charAt(i) == '1') ? 1 : 0;
            opn += cnt;
        }
        return ans;
    }
}
