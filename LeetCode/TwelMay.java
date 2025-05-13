import java.util.*;
class Solution {

    //2094
    public int[] findEvenNumbers(int[] digits) {
        int [] count = new int [10];
        for(int d : digits){
            count[d]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int num = 100; num <= 999; num += 2){
            int h = num / 100;
            int t = (num / 10 ) % 10;
            int u = num % 10;

            int [] temp = new int[10];
            temp[h]++;
            temp[t]++;
            temp[u]++;

            boolean canConfirm = true;

            for(int i = 0; i < 10; i++){
                if(temp[i] > count[i]){
                    canConfirm = false;
                    break;
                }
            }

            if(canConfirm == true){
                list.add(num);
            }
        }

        Collections.sort(list);
        int [] result = list.stream().mapToInt(i -> i).toArray();
        return result;

    }
}

//219
class Solution1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;

        while(j < nums.length){
  if (set.contains(nums[j])) return true;

            set.add(nums[j]);

            // 👇 Fix: shrink window when it grows beyond k
            if (j - i >= k) {
                set.remove(nums[i]);
                i++;
            }

            j++;
        }

       
         return false;
    }
}