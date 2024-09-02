// package BinarySearch;
// import java.util.*;
public class orderIgnostic {
    public static void main(String[] args) {
        int[] arr = {12,11,10,9,7,5,4,2};
        int ans = orderIgnostics(arr, 2);
        System.out.println(ans);

    }

    static int orderIgnostics(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
         boolean isAce = arr[start] < arr[end];
         
            while (start <= end) {
                // int middle = (start + end) / 2;
                int middle = start + (end - start)/2;
                if (arr[middle] == target) {
                    return middle;
                }

                if(isAce){
                     if (target > arr[middle]) {
                        start = middle + 1;
                    }
                    //  if (target < arr[middle])
                    else {
                        end = middle - 1;
                    }
                }
                else{
                  if(target > arr[middle]){
                   end = middle - 1;
                  }
                //   else if{  (target < arr[middle])
                   else 
                    {
                        start = middle + 1;
                    }
                  }
                }

                return -1;
        }
    
    }


