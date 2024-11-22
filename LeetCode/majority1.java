import java.util.HashMap;
import java.util.Map;

public class majority1 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElementBrute(nums));
    }

    static int majorityElementBrute(int[] nums) {

        // brute force approach
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > n / 2)
                return nums[i];
        }
        return -1;
    }

    static int majortityBetter(int nums[]) {
        int n = nums.length;
        HashMap<Integer, Integer> mapp = new HashMap<>();
        // sorting the element with it's occurence
        for (int i = 0; i < n; i++) {
            int value = mapp.getOrDefault(nums[i], 0);
            mapp.put(nums[i], value + 1);
        }

        // searching for the majority element

        for (Map.Entry<Integer, Integer> it : mapp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    static int optimal(int[] nums){

        // {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5}
        int n = nums.length;
        int elem = 0;
        int count = 0;

        for(int i = 0; i< n; i++){
            if(count == 0){
                count = 1;
                elem = nums[i];
            }else if(elem == nums[i]) count++;
            else count--;
        }

        //After above iteration elem = 5; and whatever element will be at the last of the array is remaining that will be our majority 

        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == elem)count1++; //checking elem 5 count only here bcz at the end of the array is remaining element were 5 and everone else has been canceld out by each other
        }

        if(count1 > (n /2)) return elem;
        return -1;

    }
}
