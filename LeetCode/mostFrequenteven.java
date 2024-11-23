import java.util.HashMap;
import java.util.Map;

public class mostFrequenteven {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 4, 4, 1 };
        System.out.println(mostFrequentEven(nums));
    }

    static int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                maps.put(i, maps.getOrDefault(i, 0) + 1);
            }
        }

        // if there is no even element then return -1 here
        if (maps.isEmpty())
            return -1;

        int mostFreqentNumber = -1; // assuming -1 if there is no element not 0 bcz it's iteself a even number
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            int currentNum = entry.getKey();
            int currNumFrequency = entry.getValue();

            if (currNumFrequency > maxFrequency
                    || (currNumFrequency == maxFrequency && currentNum < mostFreqentNumber)) {
                mostFreqentNumber = currentNum; // updatin the most frequent number by current number
                maxFrequency = currNumFrequency; // updating maxfrequency of number
            }
        }
        return mostFreqentNumber;
    }
}


