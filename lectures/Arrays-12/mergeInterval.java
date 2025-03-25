import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {
    public static void main(String[] args) {
        // int[][] intervals = {
        // {1,3},{2,6},{8,10}
        // };
        // Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        // Output: [[1,6],[8,10],[15,18]]
        // Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
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
            if (currentInterval[1] >= next[0]) {
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
