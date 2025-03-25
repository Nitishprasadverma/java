import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class validCuts {

    public static void main(String[] args) {
        int[][] rectangles = {
                { 1, 0, 5, 2 },
                {
                        0, 2, 2, 4
                },
                {
                        3, 2, 5, 3
                },
                {
                        0, 4, 4, 5
                }
        };
        int n = rectangles.length;
        System.out.println(checkValidCuts(n, rectangles));
    }

    static public boolean checkValidCuts(int n, int[][] rectangles) {
        if (n < 3)
            return false;
        List<int[]> hor = new ArrayList<>();
        List<int[]> ver = new ArrayList<>();
        for (int[] arr : rectangles) {
            int x1 = arr[0];
            int y1 = arr[1];
            int x2 = arr[2];
            int y2 = arr[3];
            hor.add(new int[] { x1, x2 });
            ver.add(new int[] { y1, y2 });

        }

        int[][] horArray = hor.toArray(new int[hor.size()][]);
        int[][] verArray = ver.toArray(new int[ver.size()][]);
        int[][] res1 = merge(horArray);
        System.out.print(res1.length);
        if (res1.length >= 3)
            return true;

        int[][] res2 = merge(verArray);

        return res2.length >= 3;
    }

    static public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sortin by statring time

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (currentInterval[1] > next[0]) {
                currentInterval[1] = Math.max(currentInterval[1], next[1]);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = next;

            }
        }

        mergedIntervals.add(currentInterval);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
