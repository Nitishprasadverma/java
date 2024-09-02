import java.util.*;
public class partitionArray {
    public static void main(String[] args) {
        int[]  nums = {-3,4,3,2};

        int[] ans = partitionArrayIndexBased(nums, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] partitionArrayIndexBased(int[] nums , int pivot){
        int inclen = 0;
       int[] newarr = new int[nums.length];
    //    int high = nums.length - 1;

       for(int num: nums){
        if(num < pivot){
            newarr[inclen] = num;
            inclen++;
        }
       }

       for(int num: nums){
        if(num == pivot){
           newarr[inclen] = num;
            inclen++;
        }
       }

       for(int num: nums){
        if(num > pivot){
           newarr[inclen] = num;
           inclen++;
        }
       }
return newarr;
    }

    
}
