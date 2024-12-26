import java.util.ArrayList;
import java.util.Collections;


// You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

// Examples:

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.


public class Leaders {
    public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

     static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n - 1];
        list.add(max);
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] >= max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
