// import java.util.*;
public class sqrtIfExist {
    public static void main(String[] args) {
      int arr[] = { 10,2,5,3};
    //   [7,1,14,11]
      System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if((i != j) && (arr[i] == 2 * arr[j] ) || (i != j) && (arr[i] * 2 ==  arr[j] )){
                    return true;
                }
            }
        }
        return false;
    }
}
