import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class maxInteger2554 {
    public static void main(String[] args) {
        int[] banned = { 1, 6, 5 };
        int n = 5, maxSum = 6;
        System.out.println(maxCount(banned, n, maxSum));
        System.out.println(maxCountHasSet(banned, n, maxSum));
    }

    // brute
    static int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int cnt = 0, j = 0;
        Arrays.sort(banned);

        for (int i = 1; i <= n; i++) {

            // skipping duplicate
            while (j < banned.length && banned[j] < i) {
                j++;
            }

            // skping if num is banned
            if (j < banned.length && i == banned[j])
                continue;

            if (sum + i <= maxSum) {
                cnt++;
                sum += i;
            } else {
                break;
            }
        }

        return cnt;
    }

    // optimal one using hasSet

    static int maxCountHasSet(int[] banned, int n, int maxSum) {
        int count = 0;
        int sum = 0;
        Set<Integer> bannedSet = new HashSet<>();

        for (int num : banned) {
            bannedSet.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i) && sum + i <= maxSum) {
                count++;
                sum += i;
            }
        }
        return count;

    }
}
