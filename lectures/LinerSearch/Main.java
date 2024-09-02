package LinerSearch;
// import java.util.*;

public class Main {
   
    public static void main(String[] args) {
        int[] arr = { 23, 4, 5, 76, 8, 87 };

    //    boolean ans = SearchForelement(arr, 87);
    //     System.out.println(ans); //for boolean value

    int ans = Search(arr, 87);
    System.out.println(ans);
       
    }

    static int Search(int[] arr, int element){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    // static boolean SearchForelement(int[] arr, int element) { //returning boolean value
    //     for (int x : arr) {
    //         if (x == element) {
    //             return true;
    //         }

    //     }
    //     return false;
    // }
}
