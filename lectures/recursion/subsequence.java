package recursion;

import java.util.*;

public class subsequence {
    public static void main(String[] args) {
      int[] arr = {3,1,2};
      List<List<Integer>> result = new ArrayList<>();  
      subsequenceOfAnArray(arr, 0, new ArrayList<>(), result);

      for(List<Integer> subseq: result){
        System.out.println(subseq);
      }
    }

    static void subsequenceOfAnArray(int[] arr, int index,List<Integer> current,List<List<Integer>> result){
        
        if(index == arr.length){
            if(!current.isEmpty()){
                result.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(arr[index]);
        subsequenceOfAnArray(arr, index + 1, current, result);


        current.remove(current.size() - 1);

        subsequenceOfAnArray(arr, index + 1, current, result);
    }
}
