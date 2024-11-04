package recursion.Arrays;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {2,5,9,5,6,13,1,2,3,3};
        // System.out.println(linearSearchIndex(arr, 13, 0));
       findAllindex(arr, 3, 0);
       System.out.println(list);
       System.out.println(findAllindex2(arr, 3, 0));
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return (arr[index] == target) || linearSearch(arr, target, index + 1);
    }
    static int linearSearchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linearSearchIndex(arr, target, index + 1);
        } 
    }
static ArrayList<Integer> list = new ArrayList<>();
    static void findAllindex(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
          list.add(index);
        }
        findAllindex(arr, target, index + 1);
    }

   
    static ArrayList<Integer> findAllindex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
          list.add(index);
        }
       return findAllindex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllindex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
          list.add(index);
        }

        ArrayList<Integer> ansFromBelowFunctionCall = findAllindex2(arr, target, index  + 1);
        list.addAll(ansFromBelowFunctionCall);
       return list;
    }
}
