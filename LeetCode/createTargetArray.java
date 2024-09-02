import java.util.*;
public class createTargetArray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,0};
        // int index[] = {0,1,2,3,0};
        // int[] ans = targetArray(arr, index);
        // System.out.println(Arrays.toString(ans));

        int nums[] = {3,2,1,5,6,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);
    }

//     static int[] targetArray(int[] arr, int[] index){
//         int[] targetArray = new int[index.length];
//         List<Integer>targetList = new ArrayList<>();
//        int j = 0;
//         for(int i = 0; i <arr.length; i++){
//             targetList.add(index[j], arr[i]);
//             j++;
//         }

//         //converting the arraylist to the string.
//         for(int i = 0; i < arr.length; i++){
// targetArray[i] = targetList.get(i);
//         }
//         return targetArray;
//     }
}
