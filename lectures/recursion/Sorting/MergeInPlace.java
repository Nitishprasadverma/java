package recursion.Sorting;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
       int[] arr = {9,8,3,4,0};
    //    mergSortInPlace(arr, 0, arr.length - 1);
    selectionSort(arr, arr.length, 0, 0);
       System.out.println(Arrays.toString(arr));
    }


    static void  mergSortInPlace(int[] arr,int s,int e) {
        if (s>= e) {
            return;
        }

        int mid = (s + e) / 2;
       mergSortInPlace(arr, s,mid );
         mergSortInPlace(arr, mid + 1, e);

         mergeinPlace(arr,s,mid + 1,e +1);
    }


    static void mergeinPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e -s];
        int i = s;
         int j = m;
         int k = 0;

         while(i <m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;

            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be psossible that on of the  arrays is not complete
            //copy the remaining element
            while (i < m) {
                mix[k] = arr[i];
                i++;
                k++;
            }

            while (j < e) {
                mix[k] = arr[j];
                j++;
                k++;
            }
         
         for(int l = 0; l < mix.length; l++){
           arr[s + l] = mix[l]; 
         }
            
    }

    static void selectionSort(int[] arr, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if(arr[c] > arr[max]){
                selectionSort(arr, r, c + 1, c);
            }else{
                selectionSort(arr, r, c + 1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionSort(arr, r - 1, 0, 0);
        }
    }
}
