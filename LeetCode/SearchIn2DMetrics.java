// import java.util.*;
public class SearchIn2DMetrics {
   public static void main(String[] args) {
    int[][] nums = {
        {1,3,5,7},{10,11,16,20},{23,30,34,60}
    };
    System.out.println(SearchIn2_D_Matrix(nums, 3));
   } 
static boolean SearchIn2_D_Matrix(int[][] matrix, int target){
    int[] array =  OneD_Array_Square_metrics(matrix);

    boolean ans = binarSearch(array,target);
    return ans;
}
   static int[] OneD_Array_Square_metrics(int[][] arr) {
    int numRows = arr.length;
    int col = arr[0].length;
    int total = numRows * col;
    int oneArray[] = new int[total];
    int k = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {

            int ele = arr[i][j];
            oneArray[k] = ele;
            k++;
        }

    }

    return oneArray;
}
 static boolean binarSearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        // int middle = (start + end) / 2;
        int middle = start + (end - start)/2;
        if (arr[middle] == target) {
            return true;
        }
        else if (target > arr[middle]) {
            start = middle + 1;
        }
        else if (target < arr[middle]) {
            end = middle - 1;
        }
        else{
            return false;
        }
    }
    return false;

}
}
