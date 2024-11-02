package recursion.Pattern;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
       triangle(4, 0);
       int[] arr ={1,9,3,5,2,4};
       bubbleSort(arr, arr.length - 1, 0);
       System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c){
      if(r == 0) return;

      if (c < r) {
        triangle(r, c + 1);
        System.out.print("*");
      }else{
        triangle(r - 1, 0);
        System.out.println();
      }
    }

    static void triangle1(int r, int c){
        if(r == 0) return;
  
        if (c < r) {
            System.out.print("*");
          triangle1(r, c + 1);
         
        }else{
            System.out.println();
          triangle1(r - 1, 0);
        
        }
      }

      static void bubbleSort(int[] arr, int r, int c){
        if(r == 0) return;
        if(c < r){
            if(arr[c] > arr[c + 1]){
                //swaping
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        }else{
            bubbleSort(arr, r - 1, 0);
        }
        
      }
   
}
