package recursion.Striver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 4 };
        List<Integer> st = new ArrayList<>();
        int target = 4;

        System.out.println(countSubseq(nums, 0, 0, target, nums.length));

        // int n = nums.length;
        // printOnlyOne(nums, 0, 0, target, st, n);
        // List<List<Integer>> result = new ArrayList<>();
        // printAllSubArray(nums, 0, nums.length, new ArrayList<>(), result);
        // System.out.println(result);

    }


    static int countSubseq(int[] nums, int index, int sum, int target,  int n) {
        if (n == index) {
            if (sum == target) {
               return 1;
               
            }
            return 0;
        }
       
        sum += nums[index];

       int l = countSubseq(nums, index + 1, sum, target,  n);
        sum -= nums[index];
        
       int r = countSubseq(nums, index + 1, sum, target, n);
        return l + r;

    }
    static void printAll(int[] nums, int index, int sum, int target, List<Integer> list, int n) {
        if (n == index) {
            if (sum == target) {
                for (Integer integer : list) {
                    System.out.print(integer);
                }
                System.out.println();
            }
            return;
        }
        list.add(nums[index]);
        sum += nums[index];

        printAll(nums, index + 1, sum, target, list, n);
        sum -= nums[index];
        list.remove(list.size() - 1);
        printAll(nums, index + 1, sum, target, list, n);

    }


    static boolean printOnlyOne(int[] nums, int index, int sum, int target, List<Integer> list, int n) {
        if (n == index) {
            if (sum == target) {
                for (Integer integer : list) {
                    System.out.print(integer);
                }
                return true;
            }
            return false;
        }
        list.add(nums[index]);
        sum += nums[index];

      if( printOnlyOne(nums, index + 1, sum, target, list, n) == true) return true ;
        sum -= nums[index];
        list.remove(list.size() - 1);
       if(printOnlyOne(nums, index + 1, sum, target, list, n) == true) return true;

       return false;

    }
    static List<List<Integer>> printAllSubArray(int[] nums, int index, int n, List<Integer> subList,
            List<List<Integer>> lst) {

        if (n == index) {
            lst.add(new ArrayList<>(subList));
            return lst;
        }
        subList.add(nums[index]);
        printAllSubArray(nums, index + 1, n, subList, lst);
        subList.remove(subList.size() - 1);
        printAllSubArray(nums, index + 1, n, subList, lst);

        return lst;

    }
}
