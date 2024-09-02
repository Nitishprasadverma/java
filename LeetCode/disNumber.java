import java.util.*;
public class disNumber {
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean value = false;
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == nums[j]){
                    value = true;
                }
                
               
            }
            if(value == false){
                list.add(i);
                System.out.println(i);
            }
            value = false;
        }
        return list;
    }
}
