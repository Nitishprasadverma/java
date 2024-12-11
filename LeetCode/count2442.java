
import java.util.HashSet;


public class count2442 {
    public static void main(String[] args) {
        int[] num = {1,13,10,12,31};

        System.out.println(countDistinctIntegers(num));

    }

    static int countDistinctIntegers(int[] nums) {
        //hashset to store distinct values

        HashSet<Integer> distinctNum = new HashSet<>();

        for(int num : nums){
            distinctNum.add(num);

            //as well as reverseed num

            distinctNum.add(reverseNumber(num));
        }

        return distinctNum.size();

    }

    static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
