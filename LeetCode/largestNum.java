import java.util.Arrays;
// import java.util.Comparator;
public class largestNum {
   public static void main(String[] args) {
    int[]  nums = {3,30,34,5,9};

    System.out.println(largestNumber(nums));
   }
  static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strNum = new String[n];

        for(int i = 0; i < nums.length; i++){
            strNum[i] = String.valueOf(nums[i]);
        }


        //sorting the array based on the custom comprasion

        Arrays.sort(strNum, (a, b) -> (b + a).compareTo(a + b)
        );

        if(strNum[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(String num : strNum){
            sb.append(num);
        }
        return sb.toString();

   }
   
}
