package recursion.Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
int[] arr = {2,4,1,8,3,9,4};
 mergSortInPlace(arr,0,arr.length -1);
System.out.println(Arrays.toString(arr));
    }

    static int[] mergSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] right = mergSort(Arrays.copyOfRange(arr, mid , arr.length ));
        int[] left = mergSort(Arrays.copyOfRange(arr, 0, mid));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
         int j = 0;
         int k = 0;

         while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;

            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be psossible that on of the  arrays is not complete
            //copy the remaining element
            while (i < first.length) {
                mix[k] = first[i];
                i++;
                k++;
            }

            while (j < second.length) {
                mix[k] = second[j];
                j++;
                k++;
            }
         
         return mix;
            
            
    }


    static void  mergSortInPlace(int[] arr,int s,int e) {
        if (e -s == 1) {
            return;
        }

        int mid = (s + e) / 2;
       mergSortInPlace(arr, s,mid );
         mergSortInPlace(arr, mid, e);

         mergeinPlace(arr,s,mid,e);
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
         
         for(int l = 0; l < mix.length; i++){
           arr[s + l] = mix[l]; 
         }
            
    }
    
}
