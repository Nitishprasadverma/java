package march;

import java.util.*;

public class twenty5 {
    public static void main(String[] args) {

    }

    public int countDays(int days, int[][] meetings) {

        int end = 0;
        int offdays = 0;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] meet : meetings) {
            if (meet[0] > end) {
                offdays += meet[0] - end - 1;

            }
            end = Math.max(meet[1], end);
        }

        if (days > end) {
            offdays += days - end;
        }
        return offdays;
    }
}
