package DifferenceArrayTech;

import java.util.Arrays;

public class ZeroArrayTrans1 {

    public static void main(String[] args) {
        ZeroArrayTrans1 obj = new ZeroArrayTrans1();
        int[] nums = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {1, 3}};
        System.out.println(obj.isZeroArray(nums, queries));
    }


    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;

//Step 1 create difference array
        int[] diffArray = new int[n];
        Arrays.fill(diffArray, 0);

        for(int [] querie: queries){
            int start = querie[0];
            int end = querie[1];

            diffArray[start] += 1;
            if(end + 1 < n ){
                diffArray[end + 1] -= 1;
            }

        }

        //commulative sum

        for(int i = 1; i < n; i++){
            diffArray[i] += diffArray[i - 1];
            
        }

        for(int i = 0; i < n; i++){
            if(diffArray[i] < nums[i]) return false;
        }

return true;

    }
}